import java.util.Scanner;

public class Uni6Exe8 {
    public Uni6Exe8() {
        Scanner leitor = new Scanner(System.in);
        float vetor[] = criarELer(leitor);
        imprimirTabela(vetor);
        leitor.close();
    }

    private float[] criarELer(Scanner leitor) {
        int quantidade = 0;
        do {
            System.out.print("Digite a quantidade de " +
                    "posições para o vetor (<=20):");
            quantidade = leitor.nextInt();
        } while (quantidade <= 0 || quantidade > 20);

        float[] vetor = new float[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o valor[" + i + "]: ");
            vetor[i] = leitor.nextFloat();
        }
        return vetor;
    }

    private void imprimirTabela(float[] vetor) {

        float[] vetorUnico = new float[vetor.length];
        int posicao = 0;
        for (int i = 0; i < vetor.length; i++) {
            boolean existe = false;

            for (int j = 0; j < i; j++) {
                if (vetor[i] == vetor[j]) {
                    existe = true;
                    break;
                }
            }

            if (!existe) {
                vetorUnico[posicao] = vetor[i];
                posicao++;
            }
        }

        for (int i = 0; i < vetorUnico.length; i++) {
            System.out.print(vetorUnico[i] + " - ");
            int quantidade = 0;

            for (int j = 0; j < vetor.length; j++) {
                if (vetorUnico[i] == vetor[j]) {
                    quantidade++;
                }
            }

            System.out.println(quantidade);
        }

    }

    public static void main(String[] args) {
        new Uni6Exe8();
    }
}
