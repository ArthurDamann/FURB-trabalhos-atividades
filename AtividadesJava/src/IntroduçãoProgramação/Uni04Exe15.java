import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni04Exe15 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Digite a quantidade de meses que o funcionario foi admitido: ");
        int qtMeses = teclado.nextInt();
        


        if (qtMeses <= 0 || qtMeses > 48) {
            System.out.println("Informação inválida");
        } else {
            System.out.print("Digite o salário do funcionário: ");
            float salario = teclado.nextFloat();

            float reajuste = 0;
            if (qtMeses <= 12) {
                reajuste = salario * 0.05f;
            } else if (qtMeses >= 13 && qtMeses <= 48) {
                reajuste = salario * 0.07f;
            }

            salario += reajuste;
            System.out.println("Reajuste foi de R$ " + df.format(reajuste) + 
                        " e o novo salário é R$ " + df.format(salario));
        }
        teclado.close();

    }
}