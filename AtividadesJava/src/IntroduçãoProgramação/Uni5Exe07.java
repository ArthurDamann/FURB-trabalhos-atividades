import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o valor de n: ");
        int n = teclado.nextInt();
        
        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o " + i + "o número: ");
            double num = teclado.nextDouble();
            
            if (num > maior) {
                maior = num;
            }
            
            if (num < menor) {
                menor = num;
            }
        }
        
        System.out.println("O maior número digitado foi: " + maior);
        System.out.println("O menor número digitado foi: " + menor);

    teclado.close();
    }
}