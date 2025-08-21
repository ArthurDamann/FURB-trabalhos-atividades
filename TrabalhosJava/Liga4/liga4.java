import java.util.Scanner;

public class liga4 {
    char[][] matrix;
    private Scanner teclado;
    public char jogador = ' ';
    public char computador = ' ';
    public boolean verdadeiro = false;
    public static boolean finalizado = false;

    public static void main(String[] args) { // Pra executar os metodos
        liga4 jogo = new liga4();
        jogo.inicializarTabuleiro();
        jogo.imprimirTabuleiro();
        jogo.escolherCor();
        while (!finalizado) {
            jogo.jogada();
            jogo.jogadaComp();
            jogo.imprimirTabuleiro();
            jogo.verificarVitoria();
        }
        jogo.reiniciarPartida();
    }

    public void inicializarTabuleiro() {
        matrix = new char[6][7];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                matrix[i][j] = 'B';
            }
        }
    }

    public void imprimirTabuleiro() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-------------\n0 1 2 3 4 5 6\n-------------");
    }

    public void escolherCor() {
        teclado = new Scanner(System.in);
        System.out.println("Escolha a sua cor: (A) para Azul, ou (V) para Vermelho");
        char cor = teclado.nextLine().toUpperCase().charAt(0);
        while (cor != 'A' && cor != 'V') {
            System.out.println("Cor inválida! Escolha novamente: (A) para Azul ou (V) para Vermelho");
            cor = teclado.nextLine().toUpperCase().charAt(0);
        }
        if (cor == 'A') {
            jogador = 'A';
            computador = 'V';
        }
        if (cor == 'V') {
            jogador = 'V';
            computador = 'A';
        }
    }

    public void jogada() {
        System.out.println("Vez do jogador! Escolha uma coluna de (0-6)");
        int j = teclado.nextInt();

        while (j < 0 || j > 6 || matrix[0][j] != 'B') {
            System.out.println("Coluna inválida, Tente novamente. \nVez do jogador! Escolha uma coluna de (0-6)");
            j = teclado.nextInt();
        }

        int i = 5;

        while (matrix[i][j] != 'B') {
            i--;
        }

        matrix[i][j] = jogador;
    }

    public void jogadaComp() {
        System.out.println("Vez do computador");
        int j = (int) (Math.random() * 7);

        while (j < 0 || j > 6 || matrix[0][j] != 'B') {
            j = (int) (Math.random() * 7);
        }

        int i = 5;

        while (matrix[i][j] != 'B') {
            i--;
        }

        matrix[i][j] = computador;
    }

    public char getMatrix(int x, int y) {
        if (x < 0 || y < 0 || x > 5 || y > 6) {
            return 'B';
        }
        return matrix[x][y];
    }

    public void verificarVitoria() {
        boolean vitoria = false;
        char jogadorQueVenceu = ' ';
        boolean empate = true;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                char jogador = matrix[i][j];
                if (jogador == 'A' || jogador == 'V') { // Horizontal
                    if (getMatrix(i + 1, j) == jogador && getMatrix(i + 2, j) == jogador
                            && getMatrix(i + 3, j) == jogador) {
                        vitoria = true;
                        jogadorQueVenceu = jogador;
                    } // Vertical
                    if (getMatrix(i, j + 1) == jogador && getMatrix(i, j + 2) == jogador 
                            && getMatrix(i, j + 3) == jogador) {
                        vitoria = true;
                        jogadorQueVenceu = jogador;
                    } // Diagonal para a direita
                    if (getMatrix(i + 1, j + 1) == jogador && getMatrix(i + 2, j + 2) == jogador                                                                
                            && getMatrix(i + 3, j + 3) == jogador) {
                        vitoria = true;
                        jogadorQueVenceu = jogador;
                    } // Diagonal para a esquerda
                    if (getMatrix(i - 1, j + 1) == jogador && getMatrix(i - 2, j + 2) == jogador                                                                       
                            && getMatrix(i - 3, j + 3) == jogador) {
                        vitoria = true;
                        jogadorQueVenceu = jogador;
                    }
                }
                if (jogador == 'B') {
                    empate = false;
                }
            }
        }

        if (vitoria) {
            finalizado = true;
            if (jogadorQueVenceu == 'A') {
                System.out.println("Azul venceu a partida");
            } else if (jogadorQueVenceu == 'V') {
                System.out.println("Vermelho venceu a partida");
            }
        } else if (empate) {
            finalizado = true;
            System.out.println("A partida terminou em empate");
        }
    }

    public void reiniciarPartida() {
        finalizado = false;
        System.out.println("Deseja reiniciar a partida? (S)im ou (N)ão");
        char opcao = teclado.next().toUpperCase().charAt(0);
        while (opcao != 'S' && opcao != 'N') {
            System.out.println("Opção Incorreta. Digite Novamente: ");
            opcao = teclado.next().toUpperCase().charAt(0);
        }
        if (opcao == 'S') {
            inicializarTabuleiro();
            imprimirTabuleiro();
            escolherCor();
            while (!finalizado) {
                jogada();
                jogadaComp();
                imprimirTabuleiro();
                verificarVitoria();
            }
            reiniciarPartida();
        }
        if (opcao == 'N') {
            System.out.println("Fim do jogo");
        }
    }
}