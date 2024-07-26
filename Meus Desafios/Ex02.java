import java.util.Scanner;

public class Ex02 {

    // Digitar um número e mostrar seu dobro, o triplo e a raiz quadrada

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero  = leitura.nextInt();
        int dobro = numero * 2;
        int triplo = numero * 3;
        double raiz = Math.sqrt(numero);

        System.out.println("O dobro é igual a " +dobro+ "\nO triplo é igual " +triplo+ "\nA raiz quadrada é igual a " + raiz);

    }
}
