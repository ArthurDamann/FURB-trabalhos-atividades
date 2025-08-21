import java.util.Scanner;

public class Uni5Exe21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        double chico = 1.50;
        double ze = 1.10;
        int anos = 0;

        while(ze < chico) {
            chico += 0.02;
            ze += 0.03;
            anos++;
        }

        System.out.println("Anos Necessários para que Zé seja maior que Chico: " + anos);



    teclado.close();
    }
}
