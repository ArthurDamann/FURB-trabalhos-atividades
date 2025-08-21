import java.util.Scanner;

public class Uni6Exe4 {
    public static void main(String[] args) {
        new Uni6Exe4();
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetor3 = new int[10];

        ler(vetor1, vetor2);
        soma(vetor1, vetor2, vetor3);
        imprimir(vetor1, vetor2, vetor3);
    }

    public static void ler(int[] vetor1, int[] vetor2) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite os valores do vetor 1:");
        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = teclado.nextInt();
        }

        System.out.println("Digite os valores do vetor 2:");
        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = teclado.nextInt();
        }

        teclado.close();
    }

    public static void soma(int[] vetor1, int[] vetor2, int[] vetor3) {
        for (int i = 0; i < vetor1.length; i++) {
            vetor3[i] = vetor1[i] + vetor2[i];
        }
    }

    public static void imprimir(int[] vetor1, int[] vetor2, int[] vetor3) {
        System.out.println("Vetor 1: ");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println(vetor1[i] + " ");
        }

        System.out.println("Vetor 2: ");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.println(vetor2[i] + " ");
        }

        System.out.println("Vetor 3: ");
        for (int i = 0; i < vetor3.length; i++) {
            System.out.println(vetor3[i] + " ");
        }
    }
}