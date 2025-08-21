import java.util.Scanner;

public class Uni6Exe1 {
    
    public static void main(String[] args) {
        new Uni6Exe1();
    }

    public Uni6Exe1() {
        Scanner teclado = new Scanner(System.in);
        int[] vetor = new int[10];
        ler(teclado, vetor);
        imprimir(vetor);
        teclado.close();
    }
    private void ler(Scanner teclado, int[] vetor) {        
        // for (int i= 0 ; i < 10; i++) {
         for (int i= 0 ; i < vetor.length; i++) {
             System.out.print("Digite o número da posição [" + i +"]:");
             vetor[i] = teclado.nextInt(); 
         } 
    }
    private void imprimir(int[] vetor) {
        for (int i = vetor.length-1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}