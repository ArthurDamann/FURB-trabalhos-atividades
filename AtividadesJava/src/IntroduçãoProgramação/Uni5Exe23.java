import java.util.Scanner;

public class Uni5Exe23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome;
        int NdeVendasDoMes = 0;
        String opcao;
        double totalVendas = 0;

        System.out.println("Deseja digitar os dados de um vendedor: s (SIM) / n (NÃO)?");
        opcao = teclado.next();

        if (!opcao.equals("s") && !opcao.equals("n")) {
            System.out.println("Opção Inválida, verifique a caixa alta ou se não digitou de forma incorreta");
            System.exit(0);
        }

        while (!opcao.equals("n")) {
            System.out.println("Digite o nome do vendedor: ");
            nome = teclado.next();
            System.out.println("Digite o número de produtos vendidos: ");
            NdeVendasDoMes = teclado.nextInt();

            for (int i = 1; i <= NdeVendasDoMes; i++) {
                System.out.println("Digite o preço unitário do produto: ");
                double preco = teclado.nextDouble();
                System.out.println("Digite a quantidade vendida do produto: ");
                int quantidade = teclado.nextInt();

                double valorTotal = preco * quantidade;
                totalVendas += valorTotal;
            }
            System.out.println("Nome do vendedor: " + nome);
            System.out.println("Total de Vendas: R$" + totalVendas);
            System.out.println("Salário: R$" + (totalVendas * 0.3));
            System.out.println("Deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?");
            opcao = teclado.next();
            if (!opcao.equals("s") && !opcao.equals("n")) {
                System.out.println("Opção Inválida, verifique a caixa alta ou se não digitou de forma incorreta");
                System.exit(0);
            }
        }

        teclado.close();
    }
}
