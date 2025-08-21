import java.util.Scanner;
//Construa um programa para ler um número inteiro (assuma até 3 dígitos) e imprima a saída da seguinte forma:
//X centena(s)  Y dezena(s) K unidade(s)  
//Exemplo, se for submetido o número 384, o programa deverá exibir:
//3 centena(s)  8 dezena(s) 4 unidade(s)  



public class Uni3Exe15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        int numero;
        int divisãom;
        int restom;
        int divisãox;
        int restox;
        int divisãoy;
        int restoy;

        System.out.println("Digite o número a ser lido: ");
        numero = teclado.nextInt();

        divisãom = numero / 1000;
        restom = numero % 1000;
        divisãox = restom / 100;
        restox = restom % 100;
        divisãoy = restox / 10;
        restoy = restox % 10;

        System.out.println("Resultado: ");
        System.out.println(divisãom + " Milhar(es)");
        System.out.println(divisãox + " Centena(s)");
        System.out.println(divisãoy + " Dezena(s)");
        System.out.println(restoy + " Unidade(s)");




    teclado.close();
    }
}
