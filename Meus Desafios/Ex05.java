import java.util.Scanner;

public class Ex05 {

    // Digitar um número para ver sua taboada

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero  = leitura.nextInt();

        // Solução usando while
        System.out.println("--- Tabuada do número " + numero + " ---");
        int mult = 1;
        while (mult <= 10) {
            System.out.println(numero + " X " + mult + " = " + (numero*mult));
            mult += 1;
        }

        // Solução usando for
        System.out.println("--- Tabuada do número " + numero + " ---");
        for (int i = 1; i <= 10; i++){
            System.out.println(numero + " X " + i + " = " + (numero*i));
        }


    }
}
