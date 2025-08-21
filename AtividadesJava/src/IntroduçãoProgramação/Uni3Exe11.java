import java.util.Scanner;

/*
 * Descreva um programa que dado uma temperatura em °C informe o seu valor em °F. Fórmula:
 */

public class Uni3Exe11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    
    System.out.println("Graus Celsius: ");
    double grausC = teclado.nextDouble();

    double grausF = (9/5.0) * grausC + 32;
    System.out.println(grausF);
    

    teclado.close();

    }
}
