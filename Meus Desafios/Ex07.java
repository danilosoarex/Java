import java.util.Scanner;

public class Ex07 {

    // Código que lê o salário de um funcionário e mostra seu novo salário com 15% de aumento

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Qual o salário do funcionário? R$: ");
        double salario  = leitura.nextDouble();
        double novosalario = salario + (salario * 0.15);

        System.out.println("Um funcionário que ganhava R$ " +salario+ ", com 15% de aumento, passa a receber R$ " + novosalario);

    }
}
