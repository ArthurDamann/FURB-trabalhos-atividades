import java.util.Scanner;

public class Uni5Exe14 {
    /*
     * Um comerciante deseja fazer um levantamento do lucro das 20
     * mercadorias que comercializa. Para cada mercadoria ele tem o
     * nome, o preço de compra (PC) e o preço de venda (PV).
     * 
     * Descreva um algoritmo que:
     * escreva quantas mercadorias proporcionam: (lucro < 10%),
     * (10% <= lucro <= 20%) e (lucro > 20%), onde o percentual de lucro
     * é calculado da seguinte forma: % = (PV - PC) / PC * 100;
     * determine e escreva o valor total de compra e de venda de todas as
     * mercadorias, assim como o lucro total.
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float lucroMenos10 = 0;
        float lucroEntre10e20 = 0;
        float lucroMaior20 = 0;
        float somaPrecoCompra = 0;
        float somaPrecoVenda = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Nome do produto: ");
            System.out.print("Preço de compra: ");
            float precoCompra = entrada.nextFloat();
            somaPrecoCompra += precoCompra;

            System.out.print("Preço de venda: ");
            float precoVenda = entrada.nextFloat();
            somaPrecoVenda += precoVenda;

            float percentualLucro = (precoVenda - precoCompra) / (precoCompra * 100);
            if (percentualLucro < 10) {
                lucroMenos10++;
            } else if (percentualLucro > 20) {
                lucroMaior20++;
            } else {
                lucroEntre10e20++;
            }

            /*
             * if (percentualLucro < 10) {
             * lucroMenos10++;
             * } else if (percentualLucro >= 10 && percentualLucro <= 20) {
             * lucroEntre10e20++;
             * } else {
             * lucroMaior20++;
             * }
             */
        }

        System.out.println("Quantidade de produtos com lucro < 10% " + lucroMenos10);
        System.out.println("Quantidade de produtos com lucro entre 10% e 20%: " + lucroEntre10e20);
        System.out.println("Quantidade de produtos com lucro maior que 20%: " + lucroMaior20);

        System.out.println("Total de compras: R$" + somaPrecoCompra);
        System.out.println("Total de vendas: R$" + somaPrecoVenda);
        System.out.println("Total de lucro: R$" + (somaPrecoVenda - somaPrecoCompra));

        entrada.close();
    }
}