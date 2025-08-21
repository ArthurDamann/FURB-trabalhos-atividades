import java.util.Scanner;

/*
 * Descreva um programa que a partir da distância percorrida e o do tempo gasto por um motorista durante uma viagem de final de semana, 
 * calcule a velocidade média e a quantidade de combustível gasto na viagem, sabendo que o automóvel faz 12 km por litro.
 */


public class Uni3Exe14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double distância; //em km
        double tempo; //em hora
        double velocidademédia;
        double qtdcombustível;
        double kmporlitro;
        
        System.out.println("Digite a distância percorrida: ");
        distância = teclado.nextDouble();
        System.out.println("Digite o tempo gasto: ");
        tempo = teclado.nextDouble();
        System.out.println("Digite quantos km o automóvel faz por litro: ");
        kmporlitro = teclado.nextDouble();

        velocidademédia = distância / tempo;
        qtdcombustível = distância / kmporlitro;

        System.out.println("Velocidade média: " + velocidademédia);
        System.out.println("Combustível gasto: " + qtdcombustível);
    


    
    teclado.close();
    }
}
