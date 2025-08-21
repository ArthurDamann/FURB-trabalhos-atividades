import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni5Exe19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("0.00");

        double totalRecebido = 0;
        System.out.println("Digite o valor da compra:");

        double valorCompra = teclado.nextDouble();

        while (valorCompra != 0) {
            double desconto;

            if (valorCompra > 500) {
                desconto = 0.2;
            } else {
                desconto = 0.15;
            }

            double totalPagar = valorCompra - (valorCompra * desconto);
            totalRecebido += totalPagar;

            System.out.println("Total a pagar: R$" + d.format(totalPagar));

            System.out.println("Digite o valor da compra:");
            valorCompra = teclado.nextDouble();
        }

        System.out.println("Total recebido pela loja hoje: R$" + d.format(totalRecebido));

        teclado.close();
    }
}
