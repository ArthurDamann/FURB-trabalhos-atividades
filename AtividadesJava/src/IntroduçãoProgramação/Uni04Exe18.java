import java.util.Scanner;

public class Uni04Exe18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor do pagamento: ");
        double valor = teclado.nextDouble();

        System.out.println("Digite a data de vencimento: ");
        int vencimento = teclado.nextInt();

        System.out.println("Dia do pagamento: ");
        int diapagamento = teclado.nextInt();

        double valortotal;

        if (diapagamento <= vencimento) {
            valortotal = valor - (valor * 10 / 100);
            System.out.println("O valor a ser pago é: " + valortotal);
        } else if (diapagamento >= (vencimento + 5) && diapagamento < (vencimento + 10)) {
            valortotal = valor;
            System.out.println("O valor a ser pago é: " + valortotal);
        } else if (diapagamento >= (vencimento + 10)) {
            valortotal = valor + (valor * 2 / 100) * diapagamento;
            System.out.println("O valor a ser pago é: " + valortotal);
        }

        teclado.close();
    }
}
