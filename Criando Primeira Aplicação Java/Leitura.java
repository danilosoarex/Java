import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();

        System.out.println("Qual o ano de lançamento? ");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Diga sua avaliação para o filme");
        double avaliacao = leitura.nextDouble();

        System.out.println("seu filme favorito é: " + filme);
        System.out.println("o ano de lançamento é: " + anoDeLancamento);
        System.out.println("Sua nota foi: " + avaliacao);
    }
}