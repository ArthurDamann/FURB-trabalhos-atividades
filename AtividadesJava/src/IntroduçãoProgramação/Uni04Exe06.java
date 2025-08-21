import java.util.Scanner;
public class Uni04Exe06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escreva a letra F para Feminino e M para Masculino e I para Não Informado: ");
        String sexo = teclado.next();
        String sexo2 = sexo.toUpperCase();

        if (sexo2.equals("F")){
            System.out.println("Feminino");
        }
        else if (sexo2.equals("M") ){
            System.out.println("Masculino");
        }
        else if (sexo2.equals("I")) {
            System.out.println("Não informado");
        }
        else if (!sexo2.equals("F") && !sexo2.equals("M") && !sexo2.equals("I")) {
            System.out.println("Entrada incorreta");
        }

    teclado.close();
    }
}
