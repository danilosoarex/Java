import java.util.Scanner;

public class Ex01 {

    // Digitar um número e mostrar seu antecessor e seu sucessor

    public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    System.out.print("Digite um número: ");
        int numero  = leitura.nextInt();

    System.out.println("Analisamos o valor " + numero + ", seu antecessor é " + (numero-1) + " e o sucessor é " + (numero+1));

    }
}
