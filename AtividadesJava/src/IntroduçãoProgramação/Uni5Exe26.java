import java.util.Scanner;

public class Uni5Exe26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Valor máximo que Astolfo pode pagar?: ");
        double valorMaximo = teclado.nextDouble();

        int trechosAcima150km = 0;
        int trechosInformados = 0;
        int trechosAcimaValor = 0;

        System.out.println("Pedágio: ");
        double pedagio = teclado.nextDouble();

        while (pedagio >= 0) {
            System.out.println("Distância: ");
            int distancia = teclado.nextInt();

            trechosInformados++;

            if (pedagio > valorMaximo) {
                trechosAcimaValor++;
            }
            if (distancia > 150 && pedagio < valorMaximo) {
                trechosAcima150km++;
            }
            System.out.println("Pedágio: ");
            pedagio = teclado.nextDouble();
        }
        System.out.println("Trechos Informados: " + trechosInformados);
        System.out.println("Trechos Acima de 150 Km: " + trechosAcima150km);
        System.out.println("Trechos Acima do Valor Máximo: " + trechosAcimaValor);

        teclado.close();
    }
}
