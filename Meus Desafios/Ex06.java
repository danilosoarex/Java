import java.util.Scanner;

public class Ex06 {

    // Calcular o desconto de 5% para um determinado produto

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Qual o preço do produto? ");
        double produto  = leitura.nextDouble();
        double desconto = produto - (produto* 0.05);
        System.out.println("O produto que custava R$ " + produto + ", na promoção com 5% de desconto vai custar R$ " +desconto);

    }
}
