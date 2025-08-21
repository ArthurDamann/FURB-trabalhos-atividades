import java.util.Scanner;

public class Uni6Exe9 {
    public static void main(String[] args) {
        new Uni6Exe9();

        Scanner teclado = new Scanner(System.in);

        int numClientes = 30;

        int[] sexo = new int[numClientes];
        int[] nota = new int[numClientes];
        int[] idade = new int[numClientes];

        for (int i = 0; i < numClientes; i++) {
            System.out.println("Cliente " + (i + 1));
            System.out.print("Sexo (1 - feminino, 2 - masculino): ");
            sexo[i] = teclado.nextInt();
            System.out.print("Nota (0 a 10): ");
            nota[i] = teclado.nextInt();
            System.out.print("Idade: ");
            idade[i] = teclado.nextInt();
        }

        double mediaTotal = calcularMediaTotal(nota);
        double mediaHomem = calcularMediaHomem(nota, sexo);
        double mediaMulher = calcularMediaMulher(nota, sexo);
        int notaMulherMaisJovem = calcularNotaMulherMaisJovem(nota, idade);
        int mulheresMaisDe50ComNotaAcimaMedia = calcularMulheresMaisDe50ComNotaAcimaMedia(nota, sexo, idade, mediaTotal);

        System.out.println("Média total: " + mediaTotal);
        System.out.println("Média dos homens: " + mediaHomem);
        System.out.println("Média das mulheres: " + mediaMulher);
        System.out.println("Nota da mulher mais jovem: " + notaMulherMaisJovem);
        System.out.println("Quantidade de mulheres com mais de 50 anos que deram nota acima da média: " + mulheresMaisDe50ComNotaAcimaMedia);

        teclado.close();
    }

    private static double calcularMediaTotal(int[] notas) {
        double soma = 0;
        for (int nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    private static double calcularMediaHomem(int[] notas, int[] sexos) {
        double soma = 0;
        int contador = 0;
        for (int i = 0; i < notas.length; i++) {
            if (sexos[i] == 2) {
                soma += notas[i];
                contador++;
            }
        }
        if (contador == 0) {
            return 0;
        }
        return soma / contador;
    }

    private static double calcularMediaMulher(int[] notas, int[] sexos) {
        double soma = 0;
        int contador = 0;
        for (int i = 0; i < notas.length; i++) {
            if (sexos[i] == 1) {
                soma += notas[i];
                contador++;
            }
        }
        if (contador == 0) {
            return 0;
        }
        return soma / contador;
    }

    private static int calcularNotaMulherMaisJovem(int[] notas, int[] idades) {
        int notaMaisJovem = -1;
        for (int i = 0; i < notas.length; i++) {
            if (idades[i] < 18 && notas[i] < notaMaisJovem) {
                notaMaisJovem = notas[i];
            }
        }
        return notaMaisJovem;
    }

    private static int calcularMulheresMaisDe50ComNotaAcimaMedia(int[] notas, int[] sexos, int[] idades, double media) {
        int contador = 0;
        for (int i = 0; i < notas.length; i++) {
            if (sexos[i] == 1 && idades[i] > 50 && notas[i] > media) {
                contador++;
            }
        }
        return contador;
    }
}
