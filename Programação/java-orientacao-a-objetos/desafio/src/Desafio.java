import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome = "Breno Villas";
        String tipoConta = "Corrente";
        double saldo = 2000;
        int opcaoSistema = 0;

        String dadosCliente = """
                
                **************************************
                
                Nome do cliente: %s
                Tipo de conta: %s
                Saldo: %.2f%n
                
                **************************************
                
                """;

        String menu = """
                    ** Digite sua opção **
                    1 - Consultar saldo
                    2 - Transferir valor
                    3 - Receber valor
                    4 - Sair
                    
                    """;

        System.out.printf((dadosCliente), nome,tipoConta,saldo);

        while (opcaoSistema != 4){
            System.out.println(menu);

            opcaoSistema = entrada.nextInt();

            switch (opcaoSistema){
                case 1:
                    System.out.printf((dadosCliente), nome,tipoConta,saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor que deseja transferir:\n");
                    double valorTransferido = entrada.nextDouble();
                    saldo -= valorTransferido;
                    System.out.println("\nValor transferido com sucesso!");
                    System.out.printf((dadosCliente), nome,tipoConta,saldo);
                    break;
                case 3:
                    System.out.println("Digite o valor que deseja receber:\n");
                    double valorRecebido = entrada.nextDouble();
                    saldo += valorRecebido;
                    System.out.println("\nValor recebido com sucesso!");
                    System.out.printf((dadosCliente), nome,tipoConta,saldo);
                    break;
                case 4:
                    System.out.println("Saindo...\n");
                    break;
                default:
                    System.out.println("Digite uma opção válida.");
            }

        }


    }
}
