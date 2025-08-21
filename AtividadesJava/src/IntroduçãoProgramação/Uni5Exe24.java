import java.util.Scanner;

public class Uni5Exe24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double pesoMaxDiario;
        double pesoPeixe;
        double pesoTotalPeixes = 0;

        System.out.println("Digite o limite de peso total de pesca do dia: ");
        pesoMaxDiario = teclado.nextDouble();

        System.out.println("Digite o peso do peixe em gramas: ");
        pesoPeixe = teclado.nextDouble();
        pesoTotalPeixes += (pesoPeixe / 1000);

        while (pesoTotalPeixes < pesoMaxDiario) {
            System.out.println("Peso Total: " + pesoTotalPeixes);
            System.out.println("Deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)?");
            String opcao = teclado.next();
            if (opcao.equals("s")) {
                System.out.println("Digite o peso do peixe em gramas: ");
                pesoPeixe = teclado.nextDouble();
                pesoTotalPeixes += (pesoPeixe / 1000);
            }
            if (opcao.equals("n")) {
                System.out.println("Encerrando...");
                System.exit(0);
            }
            if (pesoTotalPeixes > pesoMaxDiario) {
                System.out.println("Limite Diário Excedido");
            }
        }

        teclado.close();
    }
}
