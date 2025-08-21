import java.util.Scanner;

public class Uni6Exe10 {

    public Uni6Exe10() {

        Scanner teclado = new Scanner(System.in);
        int numeros[] = new int[50];
        int posicaoAtual = 0;
        int opcao = 0;

        do {
            System.out.println("Digite uma opção: \n1 - Inserir");
            System.out.println("2 - Pesquisar\n3 - Alterar");
            System.out.println("4 - Excluir\n5 - Mostrar");
            System.out.println("6 - Ordenar\n7 - Inverter\n8 - Sair");

            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    posicaoAtual = inserir(teclado, numeros, posicaoAtual);
                    break;
                case 2:
                    pesquisar(teclado, numeros, posicaoAtual);
                    break;
                case 3:
                    alterar(teclado, numeros, posicaoAtual);
                    break;
                case 4:
                    posicaoAtual = excluir(teclado, numeros, posicaoAtual);
                    break;
                case 5:
                    mostrar(numeros);
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 8);

        teclado.close();
    }

    private int excluir(Scanner teclado, int[] vetor, int posicaoAtual) {
        System.out.print("Digite o valor para excluir: ");
        int numero = teclado.nextInt();
        boolean excluiu = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                vetor[i] = 0; // linha indiferente
                for (int j = (i + 1); j < vetor.length; j++) {
                    vetor[j - 1] = vetor[j];
                }
                excluiu = true;
                break;
            }
        }
        if (excluiu) {
            System.out.println("Número excluído!");
        } else {
            System.out.println("Número não existe para excluir");
        }

        posicaoAtual--;
        return posicaoAtual;
    }

    private void alterar(Scanner teclado, int[] vetor, int posicao) {
        int posicaoEncontrada = pesquisar(teclado, vetor, posicao);
        if (posicaoEncontrada != -1) {
            System.out.print("Digite o novo número: ");
            int novoNumero = teclado.nextInt();
            vetor[posicaoEncontrada] = novoNumero;
        } else {
            System.out.println("Não é possível alterar");
        }

    }

    private int pesquisar(Scanner teclado, int[] vetor, int posAtual) {
        System.out.print("Digite um número para busca: ");
        int numero = teclado.nextInt();
        // boolean achou = false;
        int posicaoEncontrado = -1;
        for (int i = 0; i < posAtual; i++) {
            if (vetor[i] == numero) {
                // achou = true;
                posicaoEncontrado = i;
                break;
            }
        }
        // if (achou) {
        if (posicaoEncontrado != -1) {
            System.out.println("Encontrou na posição " + posicaoEncontrado);
        } else {
            System.out.println("Número não encontrado");
        }
        return posicaoEncontrado;
    }

    private void mostrar(int vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    private int inserir(Scanner teclado, int[] vetor,
            int posicao) {
        if (posicao != vetor.length) {
            System.out.print("Digite um número: ");
            int numero = teclado.nextInt();

            vetor[posicao] = numero;
            posicao++;
        } else {
            System.out.println("O vetor já está cheio!");
        }
        return posicao;
    }

    public static void main(String[] args) {
        new Uni6Exe10();
    }
}