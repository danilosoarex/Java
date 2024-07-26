import java.util.Scanner;

public class Ex09 {

    // Código que pergunta a quantidade de dias e a quantidade de KMs percorridos por um carro alugado.
    // Em seguida, calcula o preço a pagar. Sabendo que o carro custa R$ 60 por dia e R$ 0,15 por KM rodado.

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Quantos dias alugados? ");
        int dias = leitura.nextInt();
        System.out.print("Quantos km rodados? ");
        int km = leitura.nextInt();
        int valorDia = dias * 60;
        double valorKm = km * 0.15;
        double total = valorDia + valorKm;

        System.out.println("Total a pagar é de R$ " + total);

    }
}
