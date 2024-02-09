import java.util.Scanner;

public class Pix {
    public static void main(String[] args) {
        double saldo = 2500.00;
        String nome = "Danilo Castro Soares";
        String tipoDeConta = "Corrente";
        System.out.println("****************************************");
        System.out.println("Nome:           " + nome);
        System.out.println("Tipo Conta:     " + tipoDeConta);
        System.out.println("Saldo Inicial:  R$" + saldo);
        System.out.println("****************************************\n");


        String menu = """
                \n** Digite sua opção **
                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair\n
                """;

        Scanner leitura = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 4) {
            System.out.println(menu);
            double deposito = 0;
            double transferir = 0;

            System.out.println("Digite a opção desejada:");
            opcao = leitura.nextInt();
            if (opcao == 1) {
                System.out.println("O Saldo atual é de R$ " + saldo);
            } else if (opcao == 2) {
                System.out.println("Informe o valor a receber:");
                deposito = leitura.nextDouble();
                saldo += deposito;
                System.out.println("Saldo atualizado R$" + saldo);
            } else if (opcao == 3) {
                System.out.println("Informe o valor que deseja transferir:");
                transferir = leitura.nextDouble();
                if (transferir > saldo){
                    System.out.println("Não há saldo suficiente para fazer essa transferência");
                } else {
                    saldo -= transferir;
                    System.out.println("Saldo atualizado R$" + saldo);
                    }
            } else if (opcao != 4){
                System.out.println("Opção inválida");
            }
        }
    }
}