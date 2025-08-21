//Uma imobiliária vende apenas terrenos retangulares. 
//Faça um programa para ler as dimensões de um terreno e depois exibir a área do terreno.
/*
Entrada _____
ler as dimensões de um terreno
Processo _____

Saída _____
exibir a área do terreno

 */
import java.util.Scanner;

 public class Uni3Exe01 {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       double largura;
       double altura;
       double area;

       System.out.println("Entre c/ largura");
       largura = teclado.nextDouble();
       System.out.println("Entre c/ altura");
       altura = teclado.nextDouble();

       area = largura * altura;

       System.out.println("Área: " + area);

       teclado.close();
    
    }
}
