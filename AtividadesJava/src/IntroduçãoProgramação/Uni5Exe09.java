import java.util.Scanner;

public class Uni5Exe09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos na turma: ");
        int n = teclado.nextInt();

        String nome = " ";
        int idade = 0;
        String nomes18 = " ";
        int idade20 = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o nome do " + (i + 1) + " Aluno: ");
            nome = teclado.next();

            System.out.print("Digite a idade do " + (i + 1) + " Aluno: ");
            idade = teclado.nextInt();

            if (idade == 18) {
                nomes18 += nome + " ";
            }
            else if (idade > 20) {
                idade20++;
            }
        }
        System.out.println("Alunos com 18 anos: " + nomes18);
        System.out.println("Quantidade de alunos com mais de 20 anos: " + idade20);

        teclado.close();
    }
}
