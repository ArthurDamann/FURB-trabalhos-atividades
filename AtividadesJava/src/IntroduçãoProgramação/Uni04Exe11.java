import java.util.Scanner;
public class Uni04Exe11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int irmao1, irmao2, irmao3;

        System.out.println("Digite o ano de nascimento do primeiro irmão: ");
        irmao1 = teclado.nextInt();
        System.out.println("Digite o ano de nascimento do segundo irmão: ");
        irmao2 = teclado.nextInt();
        System.out.println("Digite o ano de nascimento do terceiro irmão: ");
        irmao3 = teclado.nextInt();

        if (irmao1 == irmao2 && irmao2 == irmao3) {
            System.out.println("São trigemeos");
        }
        else if (irmao1 == irmao2 || irmao2 == irmao3) {
            System.out.println("São gemeos");
        } else {
            System.out.println("São irmaos");
        }


    teclado.close();
    }
}
