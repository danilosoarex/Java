import java.util.Scanner;

public class Ex03 {

    // Digitar duas notas e retornar a média

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double nota1  = leitura.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double  nota2  = leitura.nextDouble();
        double media = (nota1 + nota2) / 2;
        System.out.println("Sua média é " + media);
    }
}
