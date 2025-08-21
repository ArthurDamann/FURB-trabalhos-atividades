import java.util.Scanner;

/*
 * Dados dois valores inteiros, escreva um algoritmo que informe se eles são múltiplos ou não.
 */
public class Uni04Exe09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero1, numero2;

        System.out.println("Digite dois valores inteiros: ");
        numero1 = teclado.nextInt();
        numero2 = teclado.nextInt();

        if (numero1 % numero2 == 0 || numero2 % numero1 == 0 ) {
            System.out.println("São multiplos");
        } else {
            System.out.println("Não são multiplos");
        }


    teclado.close();
    }
}
