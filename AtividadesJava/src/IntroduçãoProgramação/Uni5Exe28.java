import java.util.Scanner;

public class Uni5Exe28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int totalVotosNenhumDeNos = 0;
        int totalVotosCPM22 = 0;
        int totalVotosSkank = 0;
        int totalVotosJotaQuest = 0;
        int totalVotos = 0;
        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {
            System.out.println("Mais um voto? s(SIM) / n(NÃO)");
            continuar = teclado.nextLine();

            if (continuar.equalsIgnoreCase("n")) {
                break;
            }

            System.out.println("Digite o código do conjunto:");
            int codigo = teclado.nextInt();

            switch (codigo) {
                case 1:
                    totalVotosNenhumDeNos++;
                    break;
                case 2:
                    totalVotosCPM22++;
                    break;
                case 3:
                    totalVotosSkank++;
                    break;
                case 4:
                    totalVotosJotaQuest++;
                    break;
                default:
                    System.out.println("Código inválido");
                    break;
            }

            totalVotos++;
        }

        System.out.println("Total de votos para Nenhum de Nós: " + totalVotosNenhumDeNos);
        System.out.println("Total de votos para CPM22: " + totalVotosCPM22);
        System.out.println("Total de votos para Skank: " + totalVotosSkank);
        System.out.println("Total de votos para Jota Quest: " + totalVotosJotaQuest);

        double percentualNenhumDeNos = (double) totalVotosNenhumDeNos / totalVotos * 100;
        double percentualCPM22 = (double) totalVotosCPM22 / totalVotos * 100;
        double percentualSkank = (double) totalVotosSkank / totalVotos * 100;
        double percentualJotaQuest = (double) totalVotosJotaQuest / totalVotos * 100;

        System.out.println("Percentual de votos para Nenhum de Nós: " + percentualNenhumDeNos + "%");
        System.out.println("Percentual de votos para CPM22: " + percentualCPM22 + "%");
        System.out.println("Percentual de votos para Skank: " + percentualSkank + "%");
        System.out.println("Percentual de votos para Jota Quest: " + percentualJotaQuest + "%");

        if (totalVotosNenhumDeNos > totalVotosCPM22 && totalVotosNenhumDeNos > totalVotosSkank
                && totalVotosNenhumDeNos > totalVotosJotaQuest) {
            System.out.println("O grupo vencedor é: Nenhum de Nós");
        } else if (totalVotosCPM22 > totalVotosSkank && totalVotosCPM22 > totalVotosJotaQuest) {
            System.out.println("O grupo vencedor é: CPM22");
        } else if (totalVotosSkank > totalVotosJotaQuest) {
            System.out.println("O grupo vencedor é: Skank");
        } else {
            System.out.println("O grupo vencedor é: Jota Quest");
        }

        teclado.close();
    }
}