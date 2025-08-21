import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni5Exe17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat d_2 = new DecimalFormat("0.00");

        double altura;
        int nInscricao;
        int numeroIncricaoAlto = 0;
        int numeroIncricaoBaixo = 0;
        double alturaBaixo = Double.MAX_VALUE;
        double alturaAlto = 0;
        double somaAlturas = 0;
        int qntAtletas = 0;

        System.out.println("Digite o número de inscrição: ");
        nInscricao = teclado.nextInt();

        while (nInscricao != 0) {
            System.out.println("Digite a altura: ");
            altura = teclado.nextDouble();

            if (altura > alturaAlto) {
                alturaAlto = altura;
                numeroIncricaoAlto = nInscricao;
            }
            if (altura < alturaBaixo) {
                alturaBaixo = altura;
                numeroIncricaoBaixo = nInscricao;
            }

            somaAlturas += altura;
            qntAtletas++;

            System.out.println("Digite o número de inscrição: ");
            nInscricao = teclado.nextInt();
        }
        double mediaAltura = somaAlturas / qntAtletas;

        System.out.println("Número de inscrição do atleta mais alto: " + numeroIncricaoAlto);
        System.out.println("Altura do atleta mais alto: " + d_2.format(alturaAlto));
        System.out.println("Número de inscrição do atleta mais baixo: " + numeroIncricaoBaixo);
        System.out.println("Altura do atleta mais baixo: " + d_2.format(alturaBaixo));
        System.out.println("Altura média dos atletas: " + d_2.format(mediaAltura));

        teclado.close();
    }
}
