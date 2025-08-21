import java.util.Scanner;

public class Uni04Exe16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a idade do primeiro homem: ");
        int idade1 = teclado.nextInt();

        System.out.println("Digite a idade do segundo homem: ");
        int idade2 = teclado.nextInt();

        System.out.println("Digite a idade da primeira mulher: ");
        int idade3 = teclado.nextInt();

        System.out.println("Digite a idade da segunda mulher: ");
        int idade4 = teclado.nextInt();

        int somaidade;
        int mulidade;

        // idade1 + idade3, idade2 * idade4/ idade2 + idade3, idade1 * idade4/ idade2 +
        // idade3, idade1 * idade4/ idade1 + idade4, idade2 * idade4;

        if (idade1 > idade2 && idade3 > idade4) {
            somaidade = idade1 + idade4;
            mulidade = idade2 * idade3;
        } else if (idade2 > idade1 && idade4 > idade3) {
            somaidade = idade2 + idade3;
            mulidade = idade1 * idade4;
        } else if (idade2 > idade1 && idade3 > idade4) {
            somaidade = idade2 + idade4;
            mulidade = idade1 * idade3;
        } else {
            somaidade = idade1 + idade3;
            mulidade = idade2 * idade4;
        }
        System.out.println("A soma do homem mais velho com a mulher mais nova é: " + somaidade);
        System.out.println("O produto do homem mais novo com a mulher mais velha é: " + mulidade);

        teclado.close();
    }
}
