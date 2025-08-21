import java.util.Scanner;

public class Uni5Exe15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double nota1;
        double nota2;
        String nome;

        System.out.println("Digite o nome do Aluno: ");
        nome = teclado.next();

        while (!nome.equalsIgnoreCase("fim")) {
            System.out.println("Digite a primeira nota: ");
            nota1 = teclado.nextDouble();
            System.out.println("Digite a segunda nota: ");
            nota2 = teclado.nextDouble();

            double media = (nota1 + nota2) / 2;

            System.out.println("A média do aluno " + nome + " é " + media);

            System.out.print("Digite o nome do próximo Aluno: ");
            nome = teclado.next();
        }

        System.out.println("Fim");

        teclado.close();
    }
}
