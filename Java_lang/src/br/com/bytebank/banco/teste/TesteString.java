package br.com.bytebank.banco.teste;

public class TesteString {

    public static void main(String[] args) {

        String nome = "Danilo"; //object literal
        //String sobrenome = new String("Soares");

        String nome1 = nome.toLowerCase();
        System.out.println(nome1);

        String nome2 = nome.toUpperCase();
        System.out.println(nome2);

        char x = 'A';
        char y = 'a';
        String nome3 = nome.replace(x, y);
        System.out.println(nome3);

        char c = nome.charAt(3);
        System.out.println(c);

        int pos = nome.indexOf("ni");
        System.out.println(pos);

        String sub = nome.substring(2);
        System.out.println(sub);

        System.out.println(nome + " tem " + nome.length() + " caracteres");

        for (int i =0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i));
        }

        System.out.println(nome.isEmpty());

        System.out.println(nome.contains("lo"));

        String vazio = "    Danilo     ";
        String outrovazio = vazio.trim();
        System.out.println(vazio);
        System.out.println(outrovazio);
    }
}
