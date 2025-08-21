import java.util.Scanner;

public class Uni5Exe27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int dia;
        int totalPecasManha = 0;
        int totalPecasTarde = 0;
        double valor = 0;
        int diaMaiorProducao = 0;
        int maiorProducao = 0;
        String periodoMaiorProducao = "";

        System.out.println("Digite o dia de abril: ");
        dia = teclado.nextInt();

        while (dia < 1 || dia > 30) {
            System.out.println("Dia Inválido");
            dia = teclado.nextInt();
        }

        while (dia >= 1 && dia <= 30) {
            System.out.println("Digite o total de peças produzidas no turno da manhã: ");
            totalPecasManha = teclado.nextInt();

            System.out.println("Digite o total de peças produzidas no turno da tarde: ");
            totalPecasTarde = teclado.nextInt();

            if (dia >= 1 && dia <= 15) {
                if (totalPecasManha >= 30 && totalPecasTarde >= 30) {
                    if (totalPecasManha + totalPecasTarde >= 100) {
                        valor = (totalPecasManha + totalPecasTarde) * 0.8;
                    }
                    if (totalPecasManha >= 30 && totalPecasTarde >= 30) {
                        if (totalPecasManha + totalPecasTarde < 100) {
                            valor = (totalPecasManha + totalPecasTarde) * 0.5;
                        }
                    }
                } else {
                    valor = (totalPecasManha + totalPecasTarde) * 0.5;

                }
            } else if (dia > 15 && dia <= 30) {
                valor = (totalPecasManha * 0.4) + (totalPecasTarde * 0.3);
            }

            System.out.println("Valor recebido: R$" + valor);

            if (totalPecasManha + totalPecasTarde > maiorProducao) {
                maiorProducao = totalPecasManha + totalPecasTarde;
                diaMaiorProducao = dia;
            }
            if (totalPecasManha > totalPecasTarde) {
                periodoMaiorProducao = "Manhã";
            } else {
                periodoMaiorProducao = "Tarde";
            }

            System.out.println("Novo funcionário? (1.sim / 2.não)");
            int opcao = teclado.nextInt();
            if (opcao == 2) {
                break;
            }

            System.out.println("Digite o dia de abril: ");
            dia = teclado.nextInt();
            while (dia < 1 || dia > 30) {
                System.out.println("Dia Inválido");
                dia = teclado.nextInt();
            }
        }

        System.out.println("Dia de maior produção: " + diaMaiorProducao);
        System.out.println("Período de maior produção: " + periodoMaiorProducao + " (" + maiorProducao + ")");

        teclado.close();
    }}
