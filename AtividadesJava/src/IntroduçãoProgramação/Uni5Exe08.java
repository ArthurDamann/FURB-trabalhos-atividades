import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor de n: ");
        int n = teclado.nextInt();
        
        int menorNegativo = 0;
        int somaPositivos = 0;
        int contPositivos = 0;
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o " + i + "o número: ");
            int num = teclado.nextInt();
            
            if (num < 0 && num < menorNegativo) {
                menorNegativo = num;
            }
            
            if (num > 0) {
                somaPositivos += num;
                contPositivos++;
            }
        }
        
        double mediaPositivos = (double) somaPositivos / contPositivos;
        
        if (menorNegativo == 0) {
            System.out.println("Não foi informado nenhum número negativo.");
        } else {
            System.out.println("O menor valor negativo informado foi: " + menorNegativo);
        }
        
        if (contPositivos == 0) {
            System.out.println("Não foi informado nenhum número positivo.");
        } else {
            System.out.println("A média dos números positivos informados é: " + mediaPositivos);
        }
        teclado.close();
    }
}