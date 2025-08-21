import java.util.Scanner;
/*
 * Numa loja de materiais de construção, um azulejo estampado custa R$ 12,50. 
 * Faça um programa para ler o comprimento e altura de uma parede (em metros), e depois escrever o valor gasto com a compra de azulejos. 
 * Considere que um metro quadrado é formado por 9 azulejos.
 */

public class Uni3Exe13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double valorazulejo;
        double metrosquadrados;
        double valortotal;

        System.out.println("Digite o valor do azulejo: ");
        valorazulejo = teclado.nextDouble();
        System.out.println("Digite o número de metros quadrados: ");
        metrosquadrados = teclado.nextDouble();

        valortotal = (metrosquadrados * 9) * valorazulejo;
        
        System.out.println("Valor Total: " + valortotal);

    teclado.close();
    
    }
}
