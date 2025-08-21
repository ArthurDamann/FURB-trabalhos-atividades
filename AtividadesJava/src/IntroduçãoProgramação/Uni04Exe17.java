import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni04Exe17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat dc_2 = new DecimalFormat("0.00");

        System.out.println("Digite a renda anual: ");
        double rendaanual = teclado.nextDouble();

        System.out.println("Digite o número de dependentes: ");
        double dependentes = teclado.nextDouble();

        double resto = rendaanual * (dependentes * 0.02);
        double rendaliquida = rendaanual - resto;

        if (rendaliquida < 2000.00) {
            System.out.println("Não Paga Imposto");
        }
        else if (rendaliquida >= 2000.00 && rendaliquida < 5000.00) {
            double imposto = rendaliquida * 0.05;
            double RendaCImposto = rendaliquida - imposto;

            System.out.println("O imposto a ser pago é de R$ " + dc_2.format(imposto));
            System.out.println("Renda Final:  R$ " + dc_2.format(RendaCImposto));
        }
        else if (rendaliquida >= 5000.00 && rendaliquida < 10000.00) {
            double imposto = rendaliquida * 0.10;
            double RendaCImposto = rendaliquida - imposto;

            System.out.println("O imposto a ser pago é de R$ " + dc_2.format(imposto));
            System.out.println("Renda Final:  R$ " + dc_2.format(RendaCImposto));
        }
        else if (rendaliquida >= 10000.00) {
            double imposto = rendaliquida * 0.15;
            double RendaCImposto = rendaliquida - imposto;

            System.out.println("O imposto a ser pago é de R$ " + dc_2.format(imposto));
            System.out.println("Renda Final:  R$ " + dc_2.format(RendaCImposto));
        }


    teclado.close();
    }
}
