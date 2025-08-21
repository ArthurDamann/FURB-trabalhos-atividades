import java.util.Scanner;

public class Uni04Exe22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha um dos seguintes cursos: 1 para Ciência da Computação, 2 para Licenciatura da Computação e 3 para Sistemas de Informação");
        int escolha = teclado.nextInt();

        switch (escolha) {
            case 1 :
            System.out.println("Título: Bacharel em Ciência da Computação");
            break;
            case 2 :
            System.out.println("Título: Licenciado em Computação");
            break;
            case 3 :
            System.out.println("Título: Bacharel em Sistemas de Informação");

        }

    teclado.close();
    }
}
