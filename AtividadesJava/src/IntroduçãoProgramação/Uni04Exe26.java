import java.util.Scanner;

public class Uni04Exe26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha uma opção: ");
        System.out.println("T: calcular área de um triângulo de base b e altura h");
        System.out.println("Q: calcular a área de um quadrado de lado l");
        System.out.println("R: calcular a área de um retângulo de base b e altura h");
        System.out.println("C: calcular a área de um círculo de raio r");
        String opcao = teclado.next();

        double base;
        double altura;

        if (opcao.equals("T")) {
        System.out.println("Digite a base e a altura do triangulo: ");
        base = teclado.nextDouble();
        altura = teclado.nextDouble();
        System.out.println("Área do Triângulo = " + base * altura / 2);
        }
        else if (opcao.equals("Q")) {
        System.out.println("Digite o lado: ");
        double lado = teclado.nextDouble();
        System.out.println("Área do Quadrado = " + lado * lado);
        }
        else if (opcao.equals("R")) {
        System.out.println("Digite a base e a altura do retângulo: ");
        base = teclado.nextDouble();
        altura = teclado.nextDouble();
        System.out.println("Área do Retângulo = " + base * altura);
        }
        else if (opcao.equals("C")) {
        System.out.println("Digite o raio: ");
        double raio = teclado.nextDouble();
        System.out.println("Área do Circulo: " + Math.PI * Math.pow(raio, 2));
        }
        else {
            System.out.println("Opção Inválida");
        }
    /*
     * switch (opcao) {
     * case "T":
     * System.out.println("Digite a base e a altura do triangulo: ");
     * base = teclado.nextDouble();
     * altura = teclado.nextDouble();
     * System.out.println("Área do Triângulo = " + base * altura / 2);
     * break;
     * case "Q":
     * System.out.println("Digite o lado: ");
     * double lado = teclado.nextDouble();
     * System.out.println("Área do Quadrado = " + lado * lado);
     * break;
     * case "R":
     * System.out.println("Digite a base e a altura do retângulo: ");
     * base = teclado.nextDouble();
     * altura = teclado.nextDouble();
     * System.out.println("Área do Retângulo = " + base * altura);
     * break;
     * case "C":
     * System.out.println("Digite o raio: ");
     * double raio = teclado.nextDouble();
     * System.out.println("Área do Circulo: " + Math.PI * Math.pow(raio, 2));
     * } default blablablablablablaba da tbm
     */

    teclado.close();

     }
}
