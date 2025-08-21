import java.util.Scanner;

public class Uni04Exe10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int Marquinhos, Zezinho, Luluzinha;

        System.out.println("Quantos anos tem Marquinhos? :");
        Marquinhos = teclado.nextInt();
        System.out.println("Quantos anos tem Zezinho? :");
        Zezinho = teclado.nextInt();
        System.out.println("Quantos anos tem Luluzinha? :");
        Luluzinha = teclado.nextInt();

        if (Marquinhos < Zezinho && Marquinhos < Luluzinha) {
            System.out.println("Marquinhos é o caçula");
        }
        if (Zezinho < Marquinhos && Zezinho < Luluzinha) {
            System.out.println("Zezinho é o caçula");
        }
        if (Luluzinha < Marquinhos && Luluzinha < Zezinho) {
            System.out.println("Luluzinha é a caçula");
        }

    teclado.close();
    }
}
