import java.util.Scanner;

import java.text.DecimalFormat;

public class Uni5Exe20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0000");

        System.out.print("Digite a massa inicial do material radioativo em Kg: ");
        double massaInicial = teclado.nextDouble();

        int tempo = 0;

        System.out.println("Massa inicial: " + massaInicial + " Kg");

        while (massaInicial > 0.0005) {
            massaInicial /= 2;
            tempo += 50;
        }

        System.out.println("Massa final: " + df.format(massaInicial) + " Kg");
        System.out.println("Tempo necessário: " + tempo + " segundos");
        teclado.close();
    }
}
