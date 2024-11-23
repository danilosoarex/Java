package br.com.alura.java.io.teste;

import java.io.*;

public class TesteSerializacaoCliente {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //Cliente cliente = new Cliente();
        //cliente.setNome("Danilo Soares");
        //cliente.setCpf("0123456789");
        //cliente.setProfissao("Dev");

        //ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
        //oos.writeObject(cliente);
        //oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Cliente nome = (Cliente) ois.readObject();
        ois.close();

        System.out.println(nome.getNome());
    }
}