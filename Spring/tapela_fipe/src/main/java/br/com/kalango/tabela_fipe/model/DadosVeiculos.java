package br.com.kalango.tabela_fipe.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosVeiculos(@JsonAlias("code") String codigoVeiculo,
                            @JsonAlias("name") String nomeVeiculo) {
}
