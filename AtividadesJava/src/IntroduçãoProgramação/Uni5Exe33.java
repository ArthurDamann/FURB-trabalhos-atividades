import java.util.Scanner;

public class Uni5Exe33 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int candidato4 = 0;
        int votosNulos = 0;
        int votosBranco = 0;
        int totalVotos = 0;

        int voto;

        do {
            System.out.println("Digite o código do voto: ");
            voto = teclado.nextInt();

            switch (voto) {
                case 1:
                    candidato1++;
                    totalVotos++;
                    break;
                case 2:
                    candidato2++;
                    totalVotos++;
                    break;
                case 3:
                    candidato3++;
                    totalVotos++;
                    break;
                case 4:
                    candidato4++;
                    totalVotos++;
                    break;
                case 5:
                    votosNulos++;
                    totalVotos++;
                    break;
                case 6:
                    votosBranco++;
                    totalVotos++;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção incorreta");
            }
        } while (voto != 0);

        double percentualNulos = ((double) votosNulos / (double) totalVotos) * 100;
        double percentualBranco = ((double) votosBranco / (double) totalVotos) * 100;

        System.out.println("Total de votos para cada candidato:");
        System.out.println("Candidato 1: " + candidato1);
        System.out.println("Candidato 2: " + candidato2);
        System.out.println("Candidato 3: " + candidato3);
        System.out.println("Candidato 4: " + candidato4);
        System.out.println("Total de votos nulos: " + votosNulos);
        System.out.println("Total de votos em branco: " + votosBranco);
        System.out.println("Percentual de votos nulos sobre o total: " + percentualNulos + "%");
        System.out.println("Percentual de votos em branco sobre o total: " + percentualBranco + "%");

        teclado.close();
    }
}