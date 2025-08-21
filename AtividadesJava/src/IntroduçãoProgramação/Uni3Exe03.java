/*Um motorista deseja abastecer seu tanque de combustível. 
Escreva um programa para ler o preço do litro da gasolina e o
valor do pagamento e exibir quantos litros ele conseguiu colocar no tanque.
 * 
 * 
 * 
 * Valores
 * valorLitro = 2
 * valorPago = 20,00
 * qtdLitro = 10
 * 
 * 
 * 
 */


import java.util.Scanner;

 public class Uni3Exe03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double valorLitro;
        double valorPago;
        double qtdLitro;

        System.out.println("Valor litro: ");
        valorLitro = teclado.nextDouble();
        System.out.println("Valor pago: ");
        valorPago = teclado.nextDouble();

        qtdLitro = valorLitro / valorPago;

        System.out.println("Quantidade de litros abastecido:  " + qtdLitro);

        teclado.close();
    }
}
