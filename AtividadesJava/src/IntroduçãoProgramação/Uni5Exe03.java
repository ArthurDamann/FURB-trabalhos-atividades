public class Uni5Exe03 {
    public static void main(String[] args) {
        double soma = 0f;

        for(int contador = 1; contador <= 100; contador++) {
            soma += 1f / contador;
        }
        System.out.println("Soma: " + soma);
    }
}
