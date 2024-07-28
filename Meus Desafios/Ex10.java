import java.util.Scanner;

public class Ex10 {

    // Código que lê um número real qualquer pelo teclado e mostra na tela sua porção inteira

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double numero  = leitura.nextDouble();
        int num = Integer.valueOf((int) numero);
        System.out.println("O número "+numero+" tem a parte inteira " + num);

    }
}
