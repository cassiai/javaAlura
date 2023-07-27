import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        String nomeCliente = "Cassia Yumi";
        String tipoConta = "Corrente";
        double saldoAtual = 1200.00;
        int option = 0;

        System.out.println("********************************");
        System.out.println("\nNome do Cliente: " + nomeCliente);
        System.out.println("Tipo da Conta: " + tipoConta);
        System.out.println("Seu saldo atual é de R$ " + saldoAtual);
        System.out.println("********************************");

        String menu = """
                *** Escolha uma opção ***
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;
        Scanner leitura = new Scanner(System.in);
        while (option != 4){
                System.out.println(menu);
                option = leitura.nextInt();
         switch (option){
             case 1:
                 System.out.println("Seu saldo atual é: " + saldoAtual);
                 break;
             case 2:
                 System.out.println("Digite o valor que você deseja transferir: ");
                 double valorTransferido = leitura.nextDouble();
                 if(saldoAtual < valorTransferido){
                     System.out.println("Você não possui saldo para realizar essa transação.");
                 } else {
                     saldoAtual -= valorTransferido;
                     System.out.println("Seu saldo atual é: " + saldoAtual);
                 }
                 break;
             case 3:
                 System.out.println("Digite o valor recebido: ");
                 double valorRecebido = leitura.nextDouble();
                 saldoAtual += valorRecebido;
                 System.out.println("Seu novo saldo é: " + saldoAtual);
                 break;
             case 4:
                 System.out.println("Saindo...");
                 break;
             default:
                 System.out.println("Opção inválida!");
         }

        }

    }
}
