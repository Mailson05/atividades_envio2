import java.util.Scanner;

class ContaPoupanca extends Conta {
    public ContaPoupanca(String titular) {
        super(titular);
    }

    public void calcularRendimento(double selic) {
        double rendimento;
        if (selic > 8.5) {
            rendimento = 0.005 * saldo;
        } else {
            rendimento = 0.007 * selic * saldo;
        }
        saldo += rendimento;
        System.out.println("Rendimento calculado e adicionado ao saldo.");
    }

    @Override
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\nMenu Conta Poupança:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Calcular Rendimento");
            System.out.println("4. Exibir Dados da Conta");
            System.out.println("5. Sair");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o valor para depósito: ");
                    double valor = scanner.nextDouble();
                    depositar(valor);
                }
                case 2 -> {
                    System.out.print("Digite o valor para saque: ");
                    double valor = scanner.nextDouble();
                    sacar(valor);
                }
                case 3 -> {
                    System.out.print("Digite a taxa Selic atual: ");
                    double selic = scanner.nextDouble();
                    calcularRendimento(selic);
                }
                case 4 -> exibirDados();
                case 5 -> System.out.println("Saindo do menu Conta Poupança.");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 5);
    }
}
