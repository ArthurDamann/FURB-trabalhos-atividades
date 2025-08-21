import java.util.Scanner;

public class Uni04Exe05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("A cor é azul?");
        
        
        String resposta = teclado.nextLine();

        if (resposta.equals("Sim")) {
            System.out.println("Sim, a cor é azul");
        }
        else if (resposta.equals("Nao")) {
            System.out.println("Não, a cor não é azul");
        } else {
            System.out.println("Variavel Invalida");
        }
        
        
        /* boolean resposta = teclado.nextBoolean();

        if (resposta == true) {
            System.out.println("Sim, a cor é azul");
        }
        if (resposta == false) {
            System.out.println("Não, a cor não é azul");
        } */

        teclado.close();
    }
}
