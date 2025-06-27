import java.util.Scanner;

public class Ex12 {

    //Código que lẽ um número de 0 a 9999 e mostre na tela cada um dos digitos separado
    boolean True = false;

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero  = leitura.nextInt();
        int u = (numero / 1) % 10;
        int d = (numero / 10) % 10;
        int c = (numero / 100) % 10;
        int m = (numero / 1000) % 10;
        System.out.println("Unidade: " + u);
        System.out.println("Decimal: " + d);
        System.out.println("Centena: " + c);
        System.out.println("Milhar: " + m);


    }
}
