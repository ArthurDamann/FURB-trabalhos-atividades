import java.util.Scanner;

public class Uni5Exe13 {
    /*
     * Um motorista acaba de voltar de um feriado prolongado. Antes de
     * sair de viagem e imediatamente após retornar, o motorista encheu 
     * o tanque do veículo e registrou as medidas do odômetro. 
     * Em cada parada feita durante a viagem, foi registrado o valor do
     * odômetro e a quantidade de combustível comprado
     * para reabastecer o veículo (suponha que o tanque foi enchido a 
     * cada parada). Descreva um algoritmo que leia o número total de 
     * reabastecimentos feitos e os dados registrados relativos à 
     * compra de combustível. Calcule e escreva:
     * 
     * a quilometragem obtida por litro de combustível em cada parada;
     * a quilometragem média obtida por litro de combustível em toda
     * a viagem.
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int qntCombustivel = 0;
        int somaQntCombustivel = 0;
        int km = 0;
        int somaKm = 0;

        System.out.print("Quantas paradas foram feitas? ");
        int totalParadas = entrada.nextInt();

        for (int i = 0 ; i < totalParadas ; i++) {
            System.out.print("Informe a km: ");
            km = entrada.nextInt();
            somaKm = somaKm + km;

            System.out.print("Quantos litros foram abastecidos? ");
            qntCombustivel = entrada.nextInt();
            somaQntCombustivel += qntCombustivel;

            System.out.println("Km por litro da parada [ " + i + "]: " +
                                 (km / (double) qntCombustivel));

        }
        float kmMedia = (somaKm / (float) somaQntCombustivel);
        System.out.println("Km por litro média: " + kmMedia);

        entrada.close();
    }
}