package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosTodosEpisodios(@JsonAlias("Title") String titulo,
                                  @JsonAlias("Released") String lancamento,
                                  @JsonAlias("Episode") Integer numero,
                                  @JsonAlias("imdbRating") String avaliacao) {
}