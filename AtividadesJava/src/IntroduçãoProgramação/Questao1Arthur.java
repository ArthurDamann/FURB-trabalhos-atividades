import java.util.Scanner; //Arthur Henrique Damann

public class Questao1Arthur {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int idade;
        int ate15 = 0;
        int de16a30 = 0;
        int de31a45 = 0;
        int de46a60 = 0;
        int acima61 = 0;
        double media = 0;
        int total = 0;

        System.out.print("Digite a idade: ");
        idade = teclado.nextInt();

        while (idade >= 0) {
            if (idade > 0 && idade <= 15) {
                ate15++;
                total++;
                media += idade;
            }
            if (idade >= 16 && idade <= 30) {
                de16a30++;
                total++;
                media += idade;
            }
            if (idade >= 31 && idade <= 45) {
                de31a45++;
                total++;
                media += idade;
            }
            if (idade >= 46 && idade <= 60) {
                de46a60++;
                total++;
                media += idade;
            }
            if (idade >= 61) {
                acima61++;
                total++;
                media += idade;
            }
            System.out.print("Digite a idade: ");
            idade = teclado.nextInt();
        }

        double mediaFinal = media / total;
        double faixaAte15 = (ate15 * 100) / total;

        System.out.println("Até 15 anos: " + ate15);
        System.out.println("De 16 a 30 anos: " + de16a30);
        System.out.println("De 31 a 45 anos: " + de31a45);
        System.out.println("De 46 a 60: " + de46a60);
        System.out.println("Acima de 61 anos: " + acima61);
        System.out.println("Percentual de pessoas na primeira faixa etária em relação ao total: " + faixaAte15 + "%");
        System.out.println("Média de idade das pessoas informadas: " + mediaFinal);

        teclado.close();
    }
}
