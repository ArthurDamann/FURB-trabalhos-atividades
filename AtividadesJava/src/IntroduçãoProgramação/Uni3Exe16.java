import java.util.Scanner;

/*
 * Suponha que um caixa disponha apenas de notas de 100, 10 e 1 reais. 
 * Considerando que alguém está pagando uma compra, faça um programa que determine e escreva o número mínimo de notas que o caixa 
 * deve fornecer como troco. 
 * Escreva também o número de cada tipo de nota a ser fornecido como troco. Suponha que o sistema monetário não utilize centavos.
 */


public class Uni3Exe16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int valortotal;
        int valorpago;
        int troco;
        int divisãox;
        int restox;
        int divisãoy;
        int restoy;
        
        System.out.println("Digite o valor da compra: ");
        valortotal = teclado.nextInt();

        System.out.println("Digite o valor pago: ");
        valorpago = teclado.nextInt();

        troco = valorpago - valortotal;

        divisãox = troco / 100;
        restox = troco % 100;
        divisãoy = restox / 10;
        restoy = restox % 10;


        System.out.println("Troco: ");
        System.out.println(divisãox + " Nota(s) de 100");
        System.out.println(divisãoy + " Nota(s) de 10");
        System.out.println(restoy + " Nota(s) de 1");

    teclado.close();
    }
    
}
