import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni5Exe34 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("0.00");
        int opcao;
        int contasEncerradas = 0;
        int numDiarias;
        double totalPagar;
        String nome;

        do {
            System.out.println(
                    "Escolha uma opção: \n1: Encerrar a conta de um hóspede \n2: Verificar número de contas encerradas \n3: Sair");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do hóspede:");
                    nome = teclado.next();

                    System.out.println("Digite o número de diárias:");
                    numDiarias = teclado.nextInt();

                    double taxaServicos;

                    if (numDiarias < 15) {
                        taxaServicos = 7.50;
                    } else if (numDiarias == 15) {
                        taxaServicos = 6.50;
                    } else {
                        taxaServicos = 5.00;
                    }

                    totalPagar = (50.00 + taxaServicos) * numDiarias;

                    System.out.println("Nome do hóspede: " + nome);
                    System.out.println("Total a ser pago: R$" + d.format(totalPagar));

                    contasEncerradas++;
                    break;

                case 2:
                    System.out.println("Número de contas encerradas: " + contasEncerradas);
                    break;

                case 3:
                    System.out.println("Fim");
                    return;

                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while (opcao != 0);
        teclado.close();
    }
}
