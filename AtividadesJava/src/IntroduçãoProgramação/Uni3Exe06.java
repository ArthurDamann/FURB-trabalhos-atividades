/*Um restaurante cobra R$ 25,00 por cada quilo de refeição. 
Escreva um programa que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar. 
O peso do prato é de 750 gramas.
 * 
 * 
 * 
 */


import java.util.Scanner;


public class Uni3Exe06 {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        
       double valorquilo;
       double peso;
       double valortotal;

       System.out.println("Digite o valor do quilo:");
       valorquilo = teclado.nextDouble();
       System.out.println("Digite o peso: ");
       peso = teclado.nextDouble();

       valortotal = valorquilo * peso;

       System.out.println("Valor total do prato:" + valortotal);




        teclado.close();
    }
}
