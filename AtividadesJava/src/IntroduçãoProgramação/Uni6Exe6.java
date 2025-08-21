import java.util.Scanner;

public class Uni6Exe6 {
    public static void main(String[] args) {
        new Uni6Exe6();
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a quantidade de valores: ");
        int n = teclado.nextInt();

        double[] vetor = new double[n];

        ler(teclado, vetor);

        System.out.print("Informe um valor real para verificar se está cadastrado no vetor: ");
        double valor = teclado.nextDouble();
        
        teclado.close();

        boolean valorEncontrado = encontrarValor(vetor, valor);

        if (valorEncontrado) {
            System.out.println("O valor " + valor + " está cadastrado no vetor.");
        } else {
            System.out.println("O valor " + valor + " não está cadastrado no vetor.");
        }
    }

    public static void ler(Scanner scanner, double[] vetor) {
        System.out.println("Informe os valores para preencher o vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vetor[i] = scanner.nextDouble();
        }
    }

    public static boolean encontrarValor(double[] vetor, double valor) {
        for (double elemento : vetor) {
            if (elemento == valor) {
                return true;
            }
        }
        return false;

    }
}