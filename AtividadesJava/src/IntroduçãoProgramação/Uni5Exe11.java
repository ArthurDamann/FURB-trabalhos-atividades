public class Uni5Exe11 {
    public static void main(String[] args) {
        int horasPorDia = 16;
        int biscoitosQuebrados = 0;
        int quantidadeQuebrada = 1;
        
        for (int hora = 1; hora <= horasPorDia; hora++) {
            biscoitosQuebrados += quantidadeQuebrada;
            
            System.out.println("No final da hora " + hora + " foram quebrados " + quantidadeQuebrada + " biscoito(s).");
            
            quantidadeQuebrada *= 3;
        }
        
        System.out.println("No final do dia, foram quebrados " + biscoitosQuebrados + " biscoito(s).");
    }
}