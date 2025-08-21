import java.util.Scanner;

public class Uni04Exe24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite 3 valores: ");
        double v1 = teclado.nextDouble();
        double v2 = teclado.nextDouble();
        double v3 = teclado.nextDouble();

        System.out.println("Agora digite a opção: ");
        int opcao = teclado.nextInt();

        switch (opcao) {
            case 1:
                if (v1 <= v2 && v2 <= v3) {
                    System.out.println(v1 + ", " + v2 + ", " + v3); // 1 é menor que 2 e 2 é menor que 3
                } else if (v1 <= v3 && v3 <= v2) {
                    System.out.println(v1 + ", " + v3 + ", " + v2);
                } else if (v2 <= v1 && v1 <= v3) {
                    System.out.println(v2 + ", " + v1 + ", " + v3);
                } else if (v2 <= v3 && v3 <= v2) {
                    System.out.println(v2 + ", " + v3 + ", " + v1);
                } else if (v3 <= v1 && v1 <= v2) {
                    System.out.println(v3 + ", " + v1 + ", " + v2);
                } else if (v3 <= v2 && v2 <= v1) {
                    System.out.println(v3 + ", " + v2 + ", " + v1);
                }
                break;
            case 2:
                if (v3 >= v2 && v2 >= v1) {
                    System.out.println(v3 + ", " + v2 + ", " + v1);
                } else if (v3 >= v1 && v1 >= v2) {
                    System.out.println(v3 + ", " + v1 + ", " + v2);
                } else if (v2 >= v1 && v1 >= v3) {
                    System.out.println(v2 + ", " + v1 + ", " + v3);
                } else if (v2 >= v3 && v3 >= v1) {
                    System.out.println(v2 + ", " + v3 + ", " + v1);
                } else if (v1 >= v2 && v2 >= v3) {
                    System.out.println(v1 + ", " + v2 + ", " + v3);
                } else if (v1 >= v3 && v3 >= v2) {
                    System.out.println(v1 + ", " + v3 + ", " + v2);
                }
                break;
            case 3:
                if (v1 > v2 && v2 >= v3) {
                    System.out.println(v2 + ", " + v1 + ", " + v3);
                } else if (v1 > v3 && v3 >= v2) {
                    System.out.println(v3 + ", " + v1 + ", " + v2);
                } else if (v2 > v1 && v1 >= v3) {
                    System.out.println(v1 + ", " + v2 + ", " + v3);
                } else if (v2 > v3 && v3 >= v1) {
                    System.out.println(v3 + ", " + v2 + ", " + v1);
                } else if (v3 > v2 && v2 >= v1) {
                    System.out.println(v2 + ", " + v3 + ", " + v1);
                } else if (v3 > v1 && v1 >= v2) {
                    System.out.println(v1 + ", " + v3 + ", " + v2);
                }
                break;

        }

        teclado.close();
    }
}
