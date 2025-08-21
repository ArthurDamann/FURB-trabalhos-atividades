import java.util.Scanner;

public class Uni6Exe3 {
    public static void main(String[] args) {
        new Uni6Exe3();
    }

    public Uni6Exe3() {
        Scanner teclado = new Scanner(System.in);

        double vetor[] = new double[12];
        ler(teclado, vetor);
        aumento(vetor);
        imprimir(vetor);
        teclado.close();
    }

    public void ler(Scanner teclado, double[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o número da posição [" + i + "]: ");
            vetor[i] = teclado.nextDouble();
        }
    }

    public void aumento(double[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) {
                vetor[i] += vetor[i] * 0.02;
            } else {
                vetor[i] += vetor[i] * 0.05;
            }
        }
    }

    public void imprimir(double[] vetor) {
        System.out.print("Vetores Atualizados: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + ", ");
        }
    }

}
