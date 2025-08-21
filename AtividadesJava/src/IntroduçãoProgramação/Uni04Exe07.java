import java.util.Scanner;
public class Uni04Exe07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.println("Entre com peso da carta: ");
        double peso = teclado.nextDouble();
        double valorPagar = 0;

        if (peso > 50) {
            double pesoExcedido = peso - 50;
            double qtdAdicional = (pesoExcedido / 20) + 1;
            valorPagar = 0.45f + 0.45f * qtdAdicional;
            System.out.println("Custo do selo: " + valorPagar);
        } 
        if (peso <= 50) {
            valorPagar = 0.45;
            System.out.println("Custo do selo: " + valorPagar);
        }



    teclado.close();
    }
}
