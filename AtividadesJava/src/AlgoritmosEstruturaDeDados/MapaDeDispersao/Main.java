package AlgoritmosEstruturaDeDados.MapaDeDispersao;

import java.time.LocalDate;

// AED/MapaDispersao/mainTest.java

public class Main {
    public static void main(String[] args) {
        // 1. Criar mapa de dispersão para Aluno
        MapaDispersao<Aluno> mapa = new MapaDispersao<>(5);

        // 2. Inserir alunos
        Aluno a1 = new Aluno(101, "Ana", LocalDate.of(2000, 1, 10));
        Aluno a2 = new Aluno(202, "Bruno", LocalDate.of(1999, 5, 20));
        Aluno a3 = new Aluno(303, "Carla", LocalDate.of(2001, 3, 15));
        mapa.inserir(a1.getMatricula(), a1);
        mapa.inserir(a2.getMatricula(), a2);
        mapa.inserir(a3.getMatricula(), a3);

        // 3. Buscar alunos
        Aluno buscaA1 = mapa.buscar(101);
        System.out.println("Busca 101: " + (buscaA1 != null && buscaA1.getNome().equals("Ana") ? "OK" : "ERRO"));

        Aluno buscaA2 = mapa.buscar(202);
        System.out.println("Busca 202: " + (buscaA2 != null && buscaA2.getNome().equals("Bruno") ? "OK" : "ERRO"));

        Aluno buscaA3 = mapa.buscar(303);
        System.out.println("Busca 303: " + (buscaA3 != null && buscaA3.getNome().equals("Carla") ? "OK" : "ERRO"));

        // 4. Remover um aluno
        mapa.remover(202);
        Aluno buscaRemovido = mapa.buscar(202);
        System.out.println("Remoção 202: " + (buscaRemovido == null ? "OK" : "ERRO"));

        // 5. Fator de carga
        double fatorCarga = mapa.calcularFatorCarga();
        System.out.println("Fator de carga após remoção: " + fatorCarga);

        // 6. Inserir mais alunos para testar colisão
        Aluno a4 = new Aluno(106, "Daniel", LocalDate.of(2002, 7, 22)); // 106 % 5 == 1, mesma posição de 101
        mapa.inserir(a4.getMatricula(), a4);
        Aluno buscaA4 = mapa.buscar(106);
        System.out.println(
                "Busca 106 (colisão): " + (buscaA4 != null && buscaA4.getNome().equals("Daniel") ? "OK" : "ERRO"));

        // 7. Fator de carga final
        System.out.println("Fator de carga final: " + mapa.calcularFatorCarga());
    }
}
