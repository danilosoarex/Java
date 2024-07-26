import java.util.Scanner;

public class Ex04 {

    // Digitar uma distância em metros e retornar km/hm/dam/dm/cm/nm

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite uma distância em metros: ");
        double distancia  = leitura.nextDouble();
        double km = distancia / 1000;
        double hm = distancia / 100;
        double dam = distancia / 10;
        double dm = distancia / 0.10;
        double cm = distancia / 0.01;
        double mm = distancia / 0.001;


        System.out.println("A medida de " +distancia+ " metros equivale a... \n" +km+ " Quilômetors\n" +hm+ " Hectômetros\n" +dam+ " Decâmetros\n" +dm+ " Decímetros\n" +cm+ " Centímeros\n" +mm+ " Milímetros");

    }
}
