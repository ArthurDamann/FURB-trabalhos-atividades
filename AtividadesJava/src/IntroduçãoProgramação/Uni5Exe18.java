import java.util.Scanner;

public class Uni5Exe18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int canal;
        int canal4 = 0;
        int canal5 = 0;
        int canal9 = 0;
        int canal12 = 0;
        int total = 0;

        System.out.println("Digite o número do canal: ");
        canal = teclado.nextInt();

        while (canal != 0) {
            System.out.println("Digite o número de teleespectadores: ");
            int teleespectadores = teclado.nextInt();

            total += teleespectadores;

            if (canal == 4) {
                canal4 += teleespectadores;
            }
            if (canal == 5) {
                canal5 += teleespectadores;
            }
            if (canal == 9) {
                canal9 += teleespectadores;
            }
            if (canal == 12) {
                canal12 += teleespectadores;
            }

            System.out.println("Digite o número do canal: ");
            canal = teclado.nextInt();
        }
        double percentualCanal4 = ((double) canal4 / total) * 100;
        double percentualCanal5 = ((double) canal5 / total) * 100;
        double percentualCanal9 = ((double) canal9 / total) * 100;
        double percentualCanal12 = ((double) canal12 / total) * 100;

        System.out.printf("Percentual de audiência do canal 4: %.2f%%\n", percentualCanal4);
        System.out.printf("Percentual de audiência do canal 5: %.2f%%\n", percentualCanal5);
        System.out.printf("Percentual de audiência do canal 9: %.2f%%\n", percentualCanal9);
        System.out.printf("Percentual de audiência do canal 12: %.2f%%\n", percentualCanal12);
        teclado.close();
    }
}
