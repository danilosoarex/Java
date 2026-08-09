package br.com.kalango.tabela_fipe.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosMarca(//@JsonAlias("vehicleType") Integer tipoVeiculo,
                         @JsonAlias("price") String valor,
                         @JsonAlias("brand") String marca,
                         @JsonAlias("model") String modelo,
                         @JsonAlias("modelYear") Integer ano,
                         @JsonAlias("fuel") String combustivel,
                         @JsonAlias("codeFipe") String codeFipe)
                         //@JsonAlias("referenceMonth") String mesReferencia,
                         //@JsonAlias("fuelAcronym") String fuelAcronym)
    {
}
