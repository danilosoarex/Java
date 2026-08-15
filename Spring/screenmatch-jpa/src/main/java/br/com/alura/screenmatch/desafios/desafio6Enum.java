package br.com.alura.screenmatch.desafios;

import java.time.LocalDate;
import java.time.YearMonth;

public enum desafio6Enum {
    JANEIRO(1),
    FEVEREIRO(2),
    MARCO(3),
    ABRIL(4),
    MAIO(5),
    JUNHO(6),
    JULHO(7),
    AGOSTO(8),
    SETEMBRO(9),
    OUTUBRO(10),
    NOVEMBRO(11),
    DEZEMBRO(12);

    private Integer numeroMes;

        desafio6Enum(Integer numeroMes){
        this.numeroMes = numeroMes;
    }

    public int getNumeroDeDias() {
        int anoAtual = LocalDate.now().getYear();
        YearMonth anoMes = YearMonth.of(anoAtual, numeroMes);
        int diasDoMes = anoMes.lengthOfMonth();
        
        return diasDoMes;
    }
    
}
