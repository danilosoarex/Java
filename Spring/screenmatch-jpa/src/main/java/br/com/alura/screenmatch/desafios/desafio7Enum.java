package br.com.alura.screenmatch.desafios;

public enum desafio7Enum {
    REAL(1.0),
    DOLAR(5.22),
    EURO(6.04);

    
    private double valorConversao;

    desafio7Enum(double valorConversao){
    this.valorConversao = valorConversao;
    }

    public double converterPara(double valor) {
        return valor * valorConversao;
    }
    
}
