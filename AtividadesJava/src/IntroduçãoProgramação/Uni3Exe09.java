import java.util.Scanner;




public class Uni3Exe09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double pi = 3.141592653589793;
        double raio;
        double altura;

        System.out.println("Digite o valor do raio: ");
        raio = teclado.nextDouble();
        System.out.println("Digite a altura: ");
        altura = teclado.nextDouble();

        double volume = pi * raio * raio * altura;
        System.out.println("Volume total: " + volume);


        teclado.close();

    }
}
