import java.util.Scanner;

public class Uni6Exe2 {
    public static void main(String[] args) {
        new Uni6Exe2();
    }

    public Uni6Exe2() {
        Scanner teclado = new Scanner(System.in);

        int vetor[] = new int[12];
        ler(teclado, vetor);
        double media = calcularMedia(vetor);
        valoresAcimaMedia(vetor, media);
        teclado.close();
    }

    public void ler(Scanner teclado, int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o número da posição [" + i + "]: ");
            vetor[i] = teclado.nextInt();
        }
    }

    public double calcularMedia(int[] vetor) {
        double somaMedia = 0;
        for (int valor : vetor) {
            somaMedia += valor;
        }
        double media = somaMedia / vetor.length;
        System.out.println("Média: " + media);
        return media;
    }

    public void valoresAcimaMedia(int[] vetor, double media) {
        System.out.println("Valores acima da média:");
        for (int valor : vetor) {
            if (valor > media) {
                System.out.print(valor + ", ");
            }
        }
    }
}
