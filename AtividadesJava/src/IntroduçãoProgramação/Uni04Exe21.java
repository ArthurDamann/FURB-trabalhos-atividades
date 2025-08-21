import java.util.Scanner;

public class Uni04Exe21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // IMC = Massa / Altura²

        System.out.println("Digite a massa do individuo: ");
        double massa = teclado.nextDouble();
        System.out.println("Digite a altura do individuo: ");
        double altura = teclado.nextDouble();

        double IMC = massa / (altura * altura);

        if (IMC < 18.5) {
            System.out.println("Classificação: Magreza");
        }
        else if (IMC >= 18.5 && IMC <= 24.9) {
            System.out.println("Classificação: Saudável");
        }
        else if (IMC >= 25.0 && IMC <= 29.9) {
            System.out.println("Classificação: Sobrepeso");
        }
        else if (IMC >= 30 && IMC <= 34.9) {
            System.out.println("Classificação: Obesidade Grau I");
        }
        else if (IMC >= 35 && IMC <= 39.9 ) {
            System.out.println("Classificação: Obesidade Grau II (severa)");
        }
        else if (IMC >= 40.0) {
            System.out.println("Classificação: Obesidade Grau III (mórbida)");
        }

    teclado.close();
    }
}
