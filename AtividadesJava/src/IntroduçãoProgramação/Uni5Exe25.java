import java.util.Scanner;

public class Uni5Exe25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int pontosDireita = 0;
        int pontosEsquerda = 0;
        String opcao;

        System.out.println("Digite S para começar uma partida de pingue-pongue ou N para não: ");
        opcao = teclado.nextLine();

        while (opcao.equalsIgnoreCase("S")) {
            System.out.println("Digite o código do ponto: ");
            String codigoPonto = teclado.nextLine();

            if (codigoPonto.equalsIgnoreCase("D")) {
                pontosDireita++;
            } else if (codigoPonto.equalsIgnoreCase("E")) {
                pontosEsquerda++;
            }

            if ((pontosDireita >= 21 && pontosDireita - pontosEsquerda >= 2)
                    || (pontosEsquerda >= 21 && pontosEsquerda - pontosDireita >= 2)) {
                System.out.println("Partida Finalizada");
                break;
            }

            System.out.println("Digitar mais um ponto? (S/N)");
            opcao = teclado.nextLine();

            if (opcao.equalsIgnoreCase("N")) {
                System.out.println("Fim de jogo");
                break;
            }
        }
        if (pontosDireita > pontosEsquerda) {
            System.out.println("Vencedor: Oponente da Direita");
        } else if (pontosEsquerda > pontosDireita) {
            System.out.println("Vencedor: Oponente da Esquerda");
        } else {
            System.out.println("Empate");
        }

        teclado.close();
    }
}