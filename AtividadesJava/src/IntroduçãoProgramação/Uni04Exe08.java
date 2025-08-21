import java.util.Scanner;

public class Uni04Exe08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a letra: ");
        String letra = teclado.next();

        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            System.out.println("É uma vogal");
        } else {
            System.out.println("Não é uma vogal");
        }

        teclado.close();
    }
}
