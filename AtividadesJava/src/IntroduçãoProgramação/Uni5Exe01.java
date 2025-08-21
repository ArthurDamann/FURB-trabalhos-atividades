public class Uni5Exe01 {
    public static void main(String[] args) {

        for (int contador = 1; contador <= 100; contador++) {
            if (contador % 2 == 0) {
                System.out.println("PAR: " + contador);
            } else {
                System.out.println("IMPAR: " + contador);
            }
        }
    }
}