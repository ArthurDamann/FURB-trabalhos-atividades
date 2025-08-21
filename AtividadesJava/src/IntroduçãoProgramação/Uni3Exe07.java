import java.util.Scanner;

/*Uma fábrica de refrigerantes vende seu produto em três formatos: 
lata de 350 ml, garrafa de 600 ml e garrafa de 2 litros. 
Se um comerciante compra uma determinada quantidade de cada formato, 
faça um programa para calcular quantos litros de refrigerante ele comprou.
 * 
 */

public class Uni3Exe07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double lata350ml;
        double garrafa600ml;
        double garrafa2litros;
        double totaldelitros;

        System.out.println("Digite a quantidade de latas de 350 ml: ");
        lata350ml = teclado.nextDouble();
        System.out.println("Digite a quantidade de garrafas de 600 ml: ");
        garrafa600ml = teclado.nextDouble();
        System.out.println("Digite a quantidade de garrafas de 2 litros: ");
        garrafa2litros = teclado.nextDouble();

        totaldelitros = (lata350ml * 0.35) + (garrafa600ml * 0.6) + (garrafa2litros * 2);
        System.out.println("Total de litros: " + totaldelitros);




    teclado.close();


    }
}