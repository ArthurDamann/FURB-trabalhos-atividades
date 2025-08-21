import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double somaAltura = 0;
        double mediaAltura;
        
        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a altura da " + i + "a pessoa: ");
            double altura = teclado.nextDouble();
            somaAltura += altura;
        }
        
        mediaAltura = somaAltura / 20;
        System.out.println("A média de altura das 20 pessoas é: " + mediaAltura);

    teclado.close();
    }
}