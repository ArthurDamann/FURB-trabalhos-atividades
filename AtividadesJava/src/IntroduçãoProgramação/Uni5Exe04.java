public class Uni5Exe04 {
    public static void main(String[] args) {
        double S = 0f;
        int denominador = 2;

        for(int contador = 1; contador <= 20; contador++) {
            S += (double) (2 * contador + 1) / denominador;
            denominador += contador;
        }
        System.out.println("Valor de S: " + S);
    }
}
