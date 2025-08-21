import java.util.Scanner;
public class Uni04Exe04 {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);

       double numero;

       System.out.println("Digite o Número");
       numero = teclado.nextDouble();

       if (numero > 0) {
        int numeroint = (int) numero;
        if (numero != numeroint) {
            System.out.println("O número possui casas decimais");
        } else {
            System.out.println("O número não possui casas decimais");
        }
       }
    
    
    
    teclado.close();
    }    
}