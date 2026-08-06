package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.model.DadosEpisodio;
import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.model.DadosTemporada;
import br.com.alura.screenmatch.model.Episodio;
import br.com.alura.screenmatch.service.ConsumoAPI;
import br.com.alura.screenmatch.service.ConverteDados;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Principal {

    private Scanner leitura = new Scanner(System.in);

    private ConsumoAPI consumo = new ConsumoAPI();
    private ConverteDados conversor = new ConverteDados();

    private final String ENDERECO = "https://www.omdbapi.com/?t=";

    private final String API_KEY = "&apikey=279acca5";

    public void exibeMenu() {
        System.out.println("Digite o nome da série para ver: ");
        var nomeSerie = leitura.nextLine();
        var json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);
        //https://www.omdbapi.com/?t=game+of_thrones&Season=6&apikey=279acca5

        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
        //System.out.println(dados);

        List<DadosTemporada> temporadas = new ArrayList<>();

        for (int i = 1 ; i <= dados.totalTemporadas(); i++){
			json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + "&Season=" + i + API_KEY);
			DadosTemporada dadosTemporada1 = conversor.obterDados(json, DadosTemporada.class);
			temporadas.add(dadosTemporada1);
		}

//        temporadas.forEach(System.out::println);

        for(int i = 0; i < dados.totalTemporadas(); i++){
            List<DadosEpisodio> episodiosTemporada = temporadas.get(i).episodios();
            for(int j = 0; j< episodiosTemporada.size(); j++){
                //System.out.println(episodiosTemporada.get(j).titulo());
            }
        }
//        temporadas.forEach(t -> t.episodios().
//                forEach(e -> System.out.println(e.titulo())));

//        List<String> nomes = Arrays.asList("Daemon", "Aemond", "Aegon", "Cole");
//        nomes.stream().sorted().limit(3).filter(n -> n.startsWith("A")).map(n -> n.toUpperCase()).forEach(System.out::println);

        List<DadosEpisodio> dadosEpisodios = temporadas.stream()
                .flatMap(t -> t.episodios().stream())
                .collect(Collectors.toList());


        System.out.println("\nTop 10 Episódios");
//        dadosEpisodios.stream()
//                .filter(e -> !e.avaliacao().equalsIgnoreCase("N/A"))
//                .sorted(Comparator.comparing(DadosEpisodio::avaliacao).reversed())
//                .limit(10)
//                //.map(e -> e.titulo().toUpperCase())
//                .forEach(System.out::println);

        List<Episodio> episodios = temporadas.stream()
                .flatMap(t -> t.episodios().stream()
                    //.peek(e -> System.out.println("Primeiro Filtro (Temporada) "))
                .map(d -> new Episodio(t.temporada(), d)))
                    //.peek(e -> System.out.println("Segundo Filtro (Ordenação) "))
                .sorted(Comparator.comparing(Episodio::getAvaliacao).reversed())
                    //.peek(e -> System.out.println("Terceiro filtro (Mais avaliados) "))
                .limit(10)
                    //.peek(e -> System.out.println("Quarto Filtro (Limita em dez)"))
                        .collect(Collectors.toList());

        episodios.forEach(System.out::println);

//        System.out.println("A partir de que ano você deseja ver os episódios?");
//        var ano = leitura.nextInt();
//        leitura.nextLine();
//
//        LocalDate dataBusca = LocalDate.of(ano, 1, 1);
//
//        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//
//        episodios.stream()
//                .filter(e -> e.getDataLancamento() != null && e.getDataLancamento().isAfter(dataBusca))
//                .forEach(e -> {
//                    System.out.println(
//                    "Temporada: " + e.getTemporada() +
//                    " / Episódio: " + e.getTitulo() +
//                    " / Data de Lançamento: " + e.getDataLancamento().format(formatador)
//                    );
//                });

    }
}
