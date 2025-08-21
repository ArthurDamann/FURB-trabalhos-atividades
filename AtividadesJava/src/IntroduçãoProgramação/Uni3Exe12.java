/*
 * Uma empresa tem para um funcionário os seguintes dados: o nome, o número de horas trabalhadas mensais e o número de dependentes. 
 * A empresa paga R$ 10,00 por hora (valor para cálculo do salário trabalho) e R$ 60,00 por dependente (valor para cálculo do salário família) 
 * e são feitos descontos de 8,5% sobre o salário trabalho para o INSS e de 5% sobre o salário trabalho para o imposto de renda. 
 * Descreva um programa que informe o nome, o salário bruto e o salário líquido do funcionário.
 */


import java.util.Scanner;

 public class Uni3Exe12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome;
        double saláriobruto;
        double salárioliquido;
        double valortotaldependente;
        double dependentes;
        double hora;
        double valortotalhoras;
        double desconto;

        System.out.println("Digite o nome do Funcionário: ");
        nome = teclado.nextLine();
        System.out.println("Número de horas trabalhadas mensais: ");
        hora = teclado.nextDouble();
        System.out.println("Digite o número de dependentes: ");
        dependentes = teclado.nextDouble();

        valortotalhoras = hora * 10;
        valortotaldependente = dependentes * 60;
        saláriobruto = valortotalhoras + valortotaldependente;
        desconto = saláriobruto * 0.135;
        salárioliquido = saláriobruto - desconto;

        System.out.println("Nome do funcionário: " + nome);
        System.out.println( "Salário bruto: " + saláriobruto);
        System.out.println("Salário liquido: " + salárioliquido);

        teclado.close();
    }
}
