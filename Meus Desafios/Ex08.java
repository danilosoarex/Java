import java.util.Scanner;

public class Ex08 {

    // Código que converte temperatura em Celsius para Farenhait

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Informe a temperatura em ºC: ");
        double celsius  = leitura.nextDouble();
        double farenhait =  ((9 * celsius) / 5) + 32;

        System.out.println("A temperaturade "+celsius+"ºC corresponde a "+farenhait+"ºF");

    }
}
