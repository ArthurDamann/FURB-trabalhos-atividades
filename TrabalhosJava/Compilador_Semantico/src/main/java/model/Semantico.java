package model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Semantico implements Constants {

    private List<String> codigoObjeto = new ArrayList<>();
    private Map<String, String> tabelaSimbolos = new HashMap<>();
    private Stack<String> pilhaTipos = new Stack<>();
    private List<String> listaIdentificadores = new ArrayList<>();
    private String tipo = "";
    private String operadorRelacional = "";

    public void executeAction(int action, Token token) throws SemanticError {
        switch (action) {
            case 101:
                codigoObjeto.add(".assembly extern mscorlib {}");
                codigoObjeto.add(".assembly _programa{}");
                codigoObjeto.add(".module _programa.exe");
                codigoObjeto.add(".class public _programa{");
                codigoObjeto.add(" .method static public void _principal(){");
                codigoObjeto.add(" .entrypoint");
                break;

            case 102:
                codigoObjeto.add(" ret");
                codigoObjeto.add(" }");
                codigoObjeto.add("}");
                //salvarCodigoObjeto(".il");
                break;

            case 103:
                tipo = token.getLexeme();
                break;

            case 104:
                for (String id : listaIdentificadores) {
                    if (tabelaSimbolos.containsKey(id)) {
                        throw new SemanticError(id + " já declarado", token.getPosition());
                    }
                    String tipoIL = mapearTipoIL(tipo);
                    tabelaSimbolos.put(id, tipoIL);
                    codigoObjeto.add(" .locals(" + tipoIL + " " + id + ")");
                }
                listaIdentificadores.clear();
                break;

            case 105:
                listaIdentificadores.add(token.getLexeme());
                break;

            case 106:
                if (pilhaTipos.isEmpty()) {
                    throw new SemanticError("Expressão não encontrada para atribuição", token.getPosition());
                }
                String tipoExpr = pilhaTipos.pop();
                for (String id : listaIdentificadores) {
                    if (!tabelaSimbolos.containsKey(id)) {
                        throw new SemanticError(id + " não declarado", token.getPosition());
                    }
                    if (tipoExpr.equals("int64")) {
                        codigoObjeto.add(" conv.i8");
                    }
                    codigoObjeto.add(" stloc " + id);
                }
                listaIdentificadores.clear();
                break;

            case 107:
                for (String id : listaIdentificadores) {
                    if (!tabelaSimbolos.containsKey(id)) {
                        throw new SemanticError(id + " não declarado", token.getPosition());
                    }
                    String tipoVar = tabelaSimbolos.get(id);
                    if (tipoVar.equals("bool") || tipoVar.equals("char")) {
                        throw new SemanticError(id + " inválido para comando de entrada", token.getPosition());
                    }
                    codigoObjeto.add(" call string [mscorlib]System.Console::ReadLine()");
                    if (tipoVar.equals("int64")) {
                        codigoObjeto.add(" call int64 [mscorlib]System.Int64::Parse(string)");
                    } else if (tipoVar.equals("float64")) {
                        codigoObjeto.add(" call float64 [mscorlib]System.Double::Parse(string)");
                    }
                    codigoObjeto.add(" stloc " + id);
                }
                listaIdentificadores.clear();
                break;

            case 108:
                if (pilhaTipos.isEmpty()) {
                    throw new SemanticError("Nada a imprimir", token.getPosition());
                }
                String tipoPrint = pilhaTipos.pop();
                if (tipoPrint.equals("int64")) {
                    codigoObjeto.add(" conv.i8");
                }
                codigoObjeto.add(" call void [mscorlib]System.Console::Write(" + tipoPrint + ")");
                break;

            case 119:
                pilhaTipos.push("bool");
                codigoObjeto.add(" ldc.i4.1");
                break;

            case 120:
                pilhaTipos.push("bool");
                codigoObjeto.add(" ldc.i4.0");
                break;

            case 121:
                codigoObjeto.add(" ldc.i4.0");
                codigoObjeto.add(" ceq");
                break;

            case 122:
                operadorRelacional = token.getLexeme();
                break;

            case 123:
                pilhaTipos.pop();
                pilhaTipos.pop();
                pilhaTipos.push("bool");
                switch (operadorRelacional) {
                    case "==":
                        codigoObjeto.add(" ceq");
                        break;
                    case "!=":
                        codigoObjeto.add(" ceq\n ldc.i4.0\n ceq");
                        break;
                    case "<":
                        codigoObjeto.add(" clt");
                        break;
                    case ">":
                        codigoObjeto.add(" cgt");
                        break;
                }
                break;

            case 124:
                pilhaTipos.pop();
                pilhaTipos.pop();
                pilhaTipos.push("float64");
                codigoObjeto.add(" add");
                break;

            case 125:
                pilhaTipos.pop();
                pilhaTipos.pop();
                pilhaTipos.push("float64");
                codigoObjeto.add(" sub");
                break;

            case 126:
                pilhaTipos.pop();
                pilhaTipos.pop();
                pilhaTipos.push("float64");
                codigoObjeto.add(" mul");
                break;

            case 127:
                pilhaTipos.pop();
                pilhaTipos.pop();
                pilhaTipos.push("float64");
                codigoObjeto.add(" div");
                break;

            case 128:
                String id = token.getLexeme();
                if (!tabelaSimbolos.containsKey(id)) {
                    throw new SemanticError(id + " não declarado", token.getPosition());
                }
                String tipoId = tabelaSimbolos.get(id);
                pilhaTipos.push(tipoId);
                codigoObjeto.add(" ldloc " + id);
                if (tipoId.equals("int64")) {
                    codigoObjeto.add(" conv.r8");
                }
                break;

            case 129:
                pilhaTipos.push("int64");
                codigoObjeto.add(" ldc.i8 " + token.getLexeme());
                codigoObjeto.add(" conv.r8");
                break;

            case 130:
                pilhaTipos.push("float64");
                codigoObjeto.add(" ldc.r8 " + token.getLexeme());
                break;

            case 131:
                pilhaTipos.push("string");
                codigoObjeto.add(" ldstr '" + token.getLexeme() + "'");
                break;

            case 132:
                pilhaTipos.push("string");
                String texto = token.getLexeme().replaceAll("^\"|\"$", "");
                codigoObjeto.add(" ldstr \"" + texto + "\"");

                break;

            case 133:
                codigoObjeto.add(" neg");
                break;

            default:
                System.out.println("Ação #" + action + ", Token: " + token);
                break;
        }
    }

    private String mapearTipoIL(String tipo) {
        return switch (tipo) {
            case "int" ->
                "int64";
            case "float" ->
                "float64";
            case "char" ->
                "string";
            case "string" ->
                "string";
            case "bool" ->
                "bool";
            default ->
                throw new IllegalArgumentException("Tipo desconhecido: " + tipo);
        };
    }

    public void salvarCodigoObjeto(String caminho) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(caminho))) {
            for (String linha : codigoObjeto) {
                writer.println(linha);
            }
        } catch (IOException e) {
            System.err.println("Erro ao salvar código objeto: " + e.getMessage());
        }
    }

    public String getCodigoGerado() {
        StringBuilder sb = new StringBuilder();
        for (String linha : codigoObjeto) {
            sb.append(linha).append("\n");
        }
        return sb.toString();
    }
}
