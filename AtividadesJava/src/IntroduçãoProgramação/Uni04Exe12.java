import java.util.Scanner;

public class Uni04Exe12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double lado1, lado2, lado3;
        
        System.out.println("Digite o lado1: ");
        lado1 = teclado.nextDouble();
        System.out.println("Digite o lado2: ");
        lado2 = teclado.nextDouble();
        System.out.println("Digite o lado3: ");
        lado3 = teclado.nextDouble();

        if (lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2)) {
        } if (lado1 == lado2 && lado1 == lado3) {
        System.out.println("É equilatero");
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            System.out.println("É isosceles");
        } else {
            System.out.println("É escaleno");
        }
    teclado.close();
    }
}
