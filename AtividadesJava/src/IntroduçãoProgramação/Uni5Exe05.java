import java.util.Scanner;

public class Uni5Exe05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n = 0;
        do {
            System.out.print("Até qual termo você deseja imprimir? ");
            n = teclado.nextInt();
        } while (n < 3);

        int num1 = 8;
        int num2 = 10;

        System.out.print(num1 + " ");
        System.out.print(num2 + " ");

        for (int posicao = 3; posicao <= n; posicao++) {
            if (posicao % 2 == 0) {
                num2 = num1 + 2;
                System.out.print(num2 + " ");
            } else {
                num1 *= 2;
                System.out.print(num1 + " ");
            }
        }

        teclado.close();

    }
}