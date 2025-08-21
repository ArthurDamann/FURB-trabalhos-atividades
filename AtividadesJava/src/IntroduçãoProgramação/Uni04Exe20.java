import java.util.Scanner;

public class Uni04Exe20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //media = (notaProva1 + notaProva2 * 2 + notaProva3 * 3 + notaExercicios)/7

        System.out.println("Digite a nota da primeira prova: ");
        double notaProva1 = teclado.nextDouble();

        System.out.println("Digite a nota da segunda prova: ");
        double notaProva2 = teclado.nextDouble();

        System.out.println("Digite a nota da terceira prova: ");
        double notaProva3 = teclado.nextDouble();

        System.out.println("Digite a nota dos exercicios: ");
        double notaExer = teclado.nextDouble();

        double media = (notaProva1 + (notaProva2 * 2) + (notaProva3 * 3) + notaExer) / 7;

        if (media >= 9.0) {
            System.out.println("Média: " + media + ", A, Aprovado");
        }
        else if (media >= 7.5 && media < 9.0) {
            System.out.println("Média: " + media + ", B, Aprovado");
        }
        else if (media >= 6.0 && media < 7.5) {
            System.out.println("Média: " + media + ", C, Aprovado");
        }
        else if (media >= 4.0 && media < 6.0) {
            System.out.println("Média: " + media + ", D, Reprovado");
        }
        else if (media < 4.0) {
            System.out.println("Média: " + media + ", E, Reprovado");
        }


    teclado.close();
    }
}
