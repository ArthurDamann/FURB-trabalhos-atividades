import java.util.Scanner;

public class Uni5Exe29 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int valor, quantidadeCedulas;

        System.out.print("Digite o valor desejado: ");
        valor = teclado.nextInt();

        System.out.println("Quantidade mínima de cédulas:");

        quantidadeCedulas = valor / 20;
        if (quantidadeCedulas > 0) {
            System.out.println(quantidadeCedulas + " cédula(s) de 20");
            valor %= 20;
        }

        quantidadeCedulas = valor / 10;
        if (quantidadeCedulas > 0) {
            System.out.println(quantidadeCedulas + " cédula(s) de 10");
            valor %= 10;
        }

        quantidadeCedulas = valor / 5;
        if (quantidadeCedulas > 0) {
            System.out.println(quantidadeCedulas + " cédula(s) de 5");
            valor %= 5;
        }

        quantidadeCedulas = valor / 2;
        if (quantidadeCedulas > 0) {
            System.out.println(quantidadeCedulas + " cédula(s) de 2");
            valor %= 2;
        }

        quantidadeCedulas = valor;
        if (quantidadeCedulas > 0) {
            System.out.println(quantidadeCedulas + " cédula(s) de 1");
        }

        teclado.close();
    }
}
