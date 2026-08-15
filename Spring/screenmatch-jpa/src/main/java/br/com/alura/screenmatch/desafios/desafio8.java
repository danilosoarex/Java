package br.com.alura.screenmatch.desafios;

// 8 - Crie um enum CodigoErro com valores de erros HTTP, como NOT_FOUND, BAD_REQUEST, INTERNAL_SERVER_ERROR. 
// Cada valor deve ter um código numérico e uma descrição associados. 
// Adicione métodos para acessar o código e a descrição. 
// Dica: consulte o site https://http.cat/ para conhecer os vários erros HTTP e conseguir descrevê-los melhor.

public class desafio8 {
    public static void main(String[] args) {
        System.out.println(desafio8Enum.NOT_FOUND.getCodigo()); // 404
        System.out.println(desafio8Enum.BAD_REQUEST.getDescricao()); 
    }
    
}
