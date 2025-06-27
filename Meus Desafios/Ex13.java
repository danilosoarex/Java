import java.util.Scanner;

public class Ex13 {

    // Código que lê o nome de uma cidade e diz se ela começa com o nome "SANTO"

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite o nome de uma cidade: ");
        String cidade = leitura.nextLine().trim();

        String primeiraPalavra = cidade.split(" ")[0].toUpperCase();

        boolean comecaComSanto = primeiraPalavra.contains("SANTO");
        System.out.println(comecaComSanto);
    }
}
