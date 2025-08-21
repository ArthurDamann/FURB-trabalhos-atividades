import java.util.Scanner;

public class Uni5Exe32 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o dia da semana do primeiro dia do mês (1=Domingo, 2=Segunda, ..., 7=Sábado): ");
        int primeiroDiaSemana = teclado.nextInt();
        System.out.print("Digite o número de dias do mês: ");
        int numeroDiasMes = teclado.nextInt();
        teclado.close();

        System.out.println("D\tS\tT\tQ\tQ\tS\tS");

        int dia = 1;
        int diaSemana = 1;

        while (diaSemana < primeiroDiaSemana) {
            System.out.print("\t");
            diaSemana++;
        }

        while (dia <= numeroDiasMes) {
            System.out.print(dia + "\t");

            if (diaSemana % 7 == 0) {
                System.out.println();
            }

            dia++;
            diaSemana++;
            teclado.close();
        }
    }
}
