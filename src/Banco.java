import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double saldo = 2000;
        double valorRecebido = 0;
        double valorTransferido = 0;
        int operacao = 0;

        System.out.println("Operações: ");
        System.out.println("1 - Consultar saldo");
        System.out.println("2 - Receber valor");
        System.out.println("3 - Transferir valor");
        System.out.println("4 - Sair");

        while(operacao != 4) {
            operacao = leitura.nextInt();

            if(operacao == 1) {
                System.out.println("Saldo disponível: " + saldo);
            } else if (operacao == 2) {
                System.out.println("Valor recebido: ");
                valorRecebido = leitura.nextDouble();
                saldo = saldo + valorRecebido;
                System.out.println("Saldo atualizado: " + saldo);
            } else if (operacao == 3) {
                System.out.println("Valor Transferido/Sacado: ");
                valorTransferido = leitura.nextDouble();
                if (valorTransferido <= saldo) {
                    saldo = saldo - valorTransferido;
                    System.out.println("Saldo atualizado: " + saldo);
                } else {
                    System.out.println("Saldo insuficiente");
                }
            } else if (operacao == 4) {
                System.out.println("Operação finalizada!");
            } else {
                System.out.println("Operação inválida");
            }
        }
    }
}
