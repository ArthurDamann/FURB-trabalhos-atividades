import java.util.Scanner;

public class Uni5Exe31 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = teclado.nextInt();

        System.out.println("Número\tDecomposição");
        
        int fator = 2;
        
        while (numero > 1) {
            if (numero % fator == 0) {
                System.out.println(numero + "\t" + fator);
                numero = numero / fator;
            } else {
                fator++;
            }
        }


    teclado.close();
    }
}
