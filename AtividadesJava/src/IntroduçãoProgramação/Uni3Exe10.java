import java.util.Scanner;

/*
 * Descreva um programa que leia o comprimento dos catetos de um triângulo retângulo e calcule o comprimento da hipotenusa.
 */

public class Uni3Exe10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int cateto1;
        int cateto;

        System.out.println("Digite o valor do primeiro cateto: ");
        cateto1 = teclado.nextInt();
        System.out.println("Digite o valor do segundo cateto: ");
        cateto = teclado.nextInt();

        double hipotenusa = Math.sqrt((cateto1 * cateto1) + (cateto * cateto));

        System.out.println("Hipotenusa: " + hipotenusa);

    teclado.close();
    }
    
}
