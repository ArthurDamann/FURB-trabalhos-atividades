import java.util.Scanner;


public class Uni3Exe08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double dólar;
        double real;
        double totalemreais;

        System.out.println("Digite o valor em dólares a ser trocados por reais: ");
        dólar = teclado.nextDouble();
        System.out.println("Digite o valor do dólar convertido para reais: ");
        real = teclado.nextDouble();
        
        totalemreais = dólar * real;
        
        System.out.println("Valor em reais recebido: " + totalemreais);




        teclado.close();
    }
}
