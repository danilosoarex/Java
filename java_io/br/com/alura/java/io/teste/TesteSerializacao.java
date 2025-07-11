package br.com.alura.java.io.teste;

import java.io.*;

public class TesteSerializacao {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //String nome = "Danilo Soares";

        //ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));

        //oos.writeObject(nome);
        //oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
        String nome = (String) ois.readObject();
        ois.close();

        System.out.println(nome);
    }
}