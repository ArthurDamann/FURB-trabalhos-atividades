import java.util.Scanner;

public class Uni6Exe7 {
    private static final int TAMANHO_MAXIMO = 20;

    public static void main(String[] args) {
        new Uni6Exe7();
        int n = lerNumeroInteiro("Digite o valor de N (limite máximo: " + TAMANHO_MAXIMO + "): ", 1, TAMANHO_MAXIMO);
        int[] vetor = new int[n];

        preencher(vetor);

        ordenar(vetor);

        System.out.print("Vetor ordenado: ");
        exibir(vetor);
    }

    private static int lerNumeroInteiro(String mensagem, int limiteInferior, int limiteSuperior) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        do {
            System.out.print(mensagem);
            numero = teclado.nextInt();
            teclado.close();
        } while (numero < limiteInferior || numero > limiteSuperior);

        return numero;
    }

    private static void preencher(int[] vetor) {
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
            int novoNumero;

            do {
                System.out.print("Digite um número inteiro: ");
                novoNumero = teclado.nextInt();
                teclado.close();
            } while (!numeroValido(vetor, i, novoNumero));

            vetor[i] = novoNumero;
        }
    }

    private static boolean numeroValido(int[] vetor, int indice, int numero) {
        for (int i = 0; i < indice; i++) {
            if (vetor[i] == numero) {
                System.out.println("Número já existe");
                return false;
            }
        }

        return true;
    }

    private static void ordenar(int[] vetor) {
        boolean houveTrocas;

        do {
            houveTrocas = false;

            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    trocarElementos(vetor, i, i + 1);
                    houveTrocas = true;
                }
            }
        } while (houveTrocas);
    }

    private static void trocarElementos(int[] vetor, int indice1, int indice2) {
        int temp = vetor[indice1];
        vetor[indice1] = vetor[indice2];
        vetor[indice2] = temp;
    }

    private static void exibir(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("[" + vetor[i] + "]");
        }

        System.out.println();
    }
}