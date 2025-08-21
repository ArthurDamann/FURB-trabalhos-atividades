public class Uni5Exe02 {
    public static void main(String[] args) {
        int somaPares = 0, somaImpares = 0;
        
        for(int contador = 1; contador <= 100; contador++) {
            if(contador % 2 == 0) {
                somaPares += contador;
            } else {
                somaImpares += contador;
            }
        }
        
        System.out.println("Soma dos Pares: " + somaPares);
        System.out.println("Soma dos Impares: " + somaImpares);
    }
}
