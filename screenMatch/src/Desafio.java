import java.util.Scanner;

public class Desafio {
    public static final String ANSI_RESET = "\u001b[0m";
    public static final String ANSI_YELLOW = "\u001b[93m";
    public static final String ANSI_PINK = "\u001b[95m";
    public static final String ANSI_BOLD = "\u001b[1m";


    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String nome = " Viviane Mezzomo";
        String tipoConta = "Corrente";
        double saldo = 2500.0;
        int opcaoDesejada = 0;

        System.out.println(ANSI_PINK + "**************************" + ANSI_YELLOW + "*");
        System.out.println("\nDados iniciais do cliente:");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo inicial: R$ " + String.format("%.2f", saldo) + "\n");
        System.out.println("*" + ANSI_PINK + "**************************" + ANSI_RESET);

        String menuDeOperacao = """
                \n
                Operações \n
                1 - Consultar saldos
                2 - Receber valor
                3 - Transferir valor
                4 - Sair \n
                """;

        while(opcaoDesejada != 4) {
            System.out.println(menuDeOperacao);
            System.out.println("Digite a opção desejada:");
            opcaoDesejada = leitura.nextInt();

            switch (opcaoDesejada) {
                case 1: //Consultar saldo
                    System.out.println("O saldo atual é de " + ANSI_BOLD + "R$ " + String.format("%.2f", saldo) + ANSI_RESET + ".");
                    break;
                case 2: //Receber valor
                    System.out.println("Informe o valor a receber:");
                    double valorRecebido = leitura.nextDouble();
                    saldo += valorRecebido;
                    System.out.println("O saldo atualizado é de " + ANSI_BOLD + "R$ " + String.format("%.2f", saldo) + ANSI_RESET + ".");
                    break;
                case 3: //Transferir valor
                    System.out.println("Informe o valor que deseja transferir:");
                    double valorTransferido = leitura.nextDouble();
                    if (valorTransferido < saldo) {
                        saldo -= valorTransferido;
                        System.out.println("O saldo atualizado é de " + ANSI_BOLD + "R$ " + String.format("%.2f", saldo) + ANSI_RESET + ".");
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

    }
}