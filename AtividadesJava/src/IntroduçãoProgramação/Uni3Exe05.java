//Uma granja possui um controle automatizado de cada frango da sua produção.
//No pé direito do frango há um anel com um chip de identificação;
//no pé esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir.
//Sabendo que o anel com chip custa R$ 4,00 e o anel de alimento custa R$ 3,50,
//faça um programa para calcular o gasto total da granja para marcar todos os seus frangos.

/*
 * Entrada___
 * No pé direito do frango há um anel com um chip de identificação;
no pé esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir
 * Processo___
 * anel com chip custa R$ 4,00 e o anel de alimento custa R$ 3,50
 * Saída___
 * faça um programa para calcular o gasto total da granja para marcar todos os seus frangos
 */


import java.util.Scanner;


public class Uni3Exe05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double valorDoChip = 4;
        double valorAnel = 3.50 * 2;
        System.out.println("qtdFrangos: ");
        int qtdFrangos = teclado.nextInt();

        double valorPorFrango = valorDoChip + valorAnel;
        double totalGastoGranja = valorPorFrango * qtdFrangos;

        System.out.println("Total: " + totalGastoGranja);







        teclado.close();
    
    }
}
