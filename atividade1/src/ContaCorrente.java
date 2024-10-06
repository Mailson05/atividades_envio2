import java.util.Scanner;

class ContaCorrente extends Conta {
    private final double limiteChequeEspecial = 1000.00;

    public ContaCorrente(String titular) {
        super(titular);
    }

    public void usarChequeEspecial(double valor) {
        if (valor > 0 && (saldo + limiteChequeEspecial) >= valor) {
            saldo -= valor;
            System.out.println("Cheque especial utilizado com sucesso.");
        } else {
            System.out.println("Limite do cheque especial excedido.");
        }
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\nMenu Conta Corrente:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Usar Cheque Especial");
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
                    System.out.print("Digite o valor para usar o cheque especial: ");
                    double valor = scanner.nextDouble();
                    usarChequeEspecial(valor);
                }
                case 4 -> exibirDados();
                case 5 -> System.out.println("Saindo do menu Conta Corrente.");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 5);
    }
}
