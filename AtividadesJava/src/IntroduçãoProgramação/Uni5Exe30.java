import java.util.Scanner;

public class Uni5Exe30 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Tamanho da mochila (M):");
        int m = s.nextInt();

        System.out.print("Valor inicial (N):");
        int n = s.nextInt();

        System.out.print("Valor incremento (K):");
        int k = s.nextInt();

        int quantidade = 0;
        int somaInternos = 0;
        int somaExternos = 0;
        String elementosInternos = "";
        String elementosExternos = "";

        while (quantidade < m) {
            elementosInternos += n + " ";
            somaInternos += n;
            n -= k;
            quantidade++;
        }
        // Sobrou os elementos maiores que "M" até 0
        while (n >= 0) {
            elementosExternos += n + " ";
            somaExternos += n;
            n -= k;
        }

        System.out.println("Todos: " + elementosInternos + " " + elementosExternos);
        System.out.println("Internos: " + elementosInternos);
        System.out.println("Externos: " + elementosExternos);
        System.out.println("Soma internos: " + somaInternos);
        System.out.println("Soma externos: " + somaExternos);

        s.close();
    }
}