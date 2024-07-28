import java.util.Scanner;

public class Ex11 {

    // Código que lê o nome completo de uma pessoa e mostra;
    // nome com todas palavras em maiúsculas, minúsculas, quantas letras no total
    // sem considerar os espaços e quantas letras tem o primeiro nome

    public static void main(String[] args) {
        System.out.print("Digite o nome completo: ");
        Scanner leitura = new Scanner(System.in);
        String nome  = leitura.nextLine();

        System.out.println("Seu nome em maiúsculo é " + nome.toUpperCase());
        System.out.println("Seu nome em minúsculo é " + nome.toLowerCase());
        System.out.println("Seu nome possui " + nome.replace(" ","").length() + " letras");
        String regex = "[,\\.\\s]";
        String[] myArray = nome.split(regex);
        System.out.println("O primeiro nome é " + myArray[0] + " e ele tem apenas " + myArray[0].length() +" letras");

    }
}
