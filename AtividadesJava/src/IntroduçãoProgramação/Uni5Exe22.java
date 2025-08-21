public class Uni5Exe22 {
    public static void main(String[] args) {
        int ano = 1996;
        double salario = 2000;
        double aumento = 0.015;
        while (ano <= 2023) {
            salario += (salario * aumento);
            aumento *= 2;
            ano++;
        }

        System.out.println("Salário Atual: " + salario);
    }
}
