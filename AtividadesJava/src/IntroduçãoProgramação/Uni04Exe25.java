import java.util.Scanner;

public class Uni04Exe25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double n1 = teclado.nextDouble();

        System.out.println("Digite o segundo número: ");
        double n2 = teclado.nextDouble();

        System.out.println(
                "Agora digite a opção de calculo: 1 para Soma de dois números, 2 para Diferença entre dois números, 3 para Produto entre dois números, 4 - Divisão entre dois números (o denominador não pode ser zero)");
        int opcao = teclado.nextInt();


        if (opcao > 4 || opcao < 1) {
            System.out.println("Opção Invalida");
        }
        switch (opcao) {
            case 1:
                double soma = n1 + n2;
                System.out.println("A soma destes numeros é: " + soma);
                break;

            case 2:
                double diferenca = n1 - n2;
                System.out.println("A diferença destes numeros é: " + diferenca);
                break;
            case 3:
                double produto = n1 * n2;
                System.out.println("O produto destes numeros é: " + produto);
                break;
            case 4:
            if (n2 == 0) {
                System.out.println("Erro: O denominador é 0");
            }
                double divisao = n1 / n2;
                System.out.println("A divisão destes numeros é: " + divisao);
                break;
        }

        teclado.close();
    }
}
