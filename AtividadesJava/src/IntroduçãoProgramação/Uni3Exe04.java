/*Faça um programa para ler três notas de um aluno em uma disciplina e
imprimira sua média ponderada (as notas tem pesos respectivos de 5, 3 e 2).
 * 
 * Entrada
 * ler três notas de um aluno em uma disciplina
 * Processo
 * média ponderada = nota1 * 0,5 + nota2 * 0,3 + nota3 * 0,2
 * Saída
 * imprimira sua média ponderada
 */

import java.util.Scanner;

public class Uni3Exe04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double a = 0.5;
        double b = 0.3;
        double c = 0.2;
        double nota1;
        double nota2;
        double nota3;
        double média_ponderada;

        System.out.println("Digite Nota 1");
        nota1 = teclado.nextDouble();
        System.out.println("Digite Nota 2");
        nota2 = teclado.nextDouble();
        System.out.println("Digite Nota 3");
        nota3 = teclado.nextDouble();

        média_ponderada = nota1 * a + nota2 * b + nota3 * c;
        
        
        System.out.println("Média Ponderada: " + média_ponderada);
        
        
        
        
        
        
        teclado.close();
    }
}
