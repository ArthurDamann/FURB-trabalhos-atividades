import java.util.Scanner;

public class Uni04Exe03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int valor1;
        int valor2;

        valor1 = teclado.nextInt();
        valor2 = teclado.nextInt();

        if (valor1 > valor2) {
            System.out.println("Valor 1 é maior que Valor 2");
        } else {
            System.out.println("Valor 1 é menor que Valor 2");
        }
        
        teclado.close();
    }
}
