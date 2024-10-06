import java.util.Scanner;

public class SistemaUber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância percorrida (em km): ");
        double distancia = scanner.nextDouble();

        System.out.print("Digite o tempo de espera (em minutos): ");
        int tempoEspera = scanner.nextInt();

        System.out.print("Digite a tarifa base (R$): ");
        double tarifaBase = scanner.nextDouble();

        System.out.print("Digite o fator de demanda (1.0 para normal, maior para alta demanda): ");
        double fatorDemanda = scanner.nextDouble();

        UberCorrida corrida = new UberCorrida(distancia, tempoEspera, tarifaBase, fatorDemanda);

        corrida.exibirDetalhesCorrida();
    }
}