import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni5Exe16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat d_2 = new DecimalFormat("0.00");

        int quantidadeMulheres = 0;
        double somaAlturaMulheres = 0;
        double somaAlturaGrupo = 0;
        int quantidadeGrupo = 0;
        double altura = 0;

        System.out.println("Digite a Altura: ");
        altura = teclado.nextDouble();

        while (altura != 0) {
            System.out.println("Digite o gênero: ");
            String genero = teclado.next();

            if (genero.equalsIgnoreCase("F")) {
                somaAlturaMulheres += altura;
                quantidadeMulheres++;
            } else {
                somaAlturaGrupo += altura;
                quantidadeGrupo++;
            }
            System.out.println("Digite a Altura: ");
            altura = teclado.nextDouble();
        }

        double mediaMulheres = somaAlturaMulheres / quantidadeMulheres;
        double mediaGrupo = somaAlturaGrupo / quantidadeGrupo;

        System.out.println("Média da altura das mulheres: " + d_2.format(mediaMulheres));
        System.out.println("Média da altura do grupo: " + d_2.format(mediaGrupo));

        teclado.close();
    }
}
