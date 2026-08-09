package br.com.kalango.tabela_fipe.main;

import br.com.kalango.tabela_fipe.model.DadosMarca;
import br.com.kalango.tabela_fipe.model.DadosVeiculos;
import br.com.kalango.tabela_fipe.service.ConsumoAPI;
import br.com.kalango.tabela_fipe.service.ConverteDados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Principal {

    private Scanner leitura = new Scanner(System.in);

    private ConsumoAPI consumo = new ConsumoAPI();
    private ConverteDados conversor = new ConverteDados();

    private final String ENDERECO = "https://fipe.api.br/api/v2/";
    // https://fipe.api.br/api/v2/cars/brands/56/models/9984/years/2025-6


    public void exibeMenu() {
        System.out.println("Digite o tipo de veículo que quer pesquisar: \n" +
                "1 - Carros\n" +
                "2 - Motos\n" +
                "3 - Caminhões\n");
        var tipoVeiculo = leitura.nextInt();
        leitura.nextLine();

        List<String> tiposVeiculo = Arrays.asList("cars", "cars", "motorcycles", "trucks");
        String urlVeiculo = ENDERECO + tiposVeiculo.get(tipoVeiculo) + "/brands/";
        var json = consumo.obterDados(urlVeiculo);
        List<DadosVeiculos> marcas = conversor.obterLista(json, DadosVeiculos.class);

        for (Integer i = 0; i < marcas.size(); i++) {
            DadosVeiculos dadosMarcas = marcas.get(i);
            System.out.printf("Código: %s | Nome: %s\n", dadosMarcas.codigoVeiculo(), dadosMarcas.nomeVeiculo());
        }

        System.out.println("\n\nDigite o código da marca que quer pesquisar: ");
        var codigoVeiculosDaMarca = leitura.nextInt();
        leitura.nextLine();

        String urlVeiculosDaMarca = urlVeiculo + codigoVeiculosDaMarca + "/models/";
        json = consumo.obterDados(urlVeiculosDaMarca);
        List<DadosVeiculos> veiculosDaMarca = conversor.obterLista(json, DadosVeiculos.class);

        System.out.println("Veículos da Marca\n");
        for (int i = 0; i < veiculosDaMarca.size(); i++) {
            DadosVeiculos dadosVeiculos = veiculosDaMarca.get(i);
            System.out.printf("Código: %s | Nome: %s\n", dadosVeiculos.codigoVeiculo(), dadosVeiculos.nomeVeiculo());
        }

        System.out.println("\n\nDigite o código da modelo para consultar valores: ");
        var codigoModelo = leitura.nextInt();
        leitura.nextLine();

        String urlModelo = urlVeiculosDaMarca + codigoModelo + "/years/";
        json = consumo.obterDados(urlModelo);
        List<DadosVeiculos> modelosDaMarca = conversor.obterLista(json, DadosVeiculos.class);

        List<DadosMarca> dadosFinais = new ArrayList<>();

        for (int i = 0; i < modelosDaMarca.size(); i++) {
            DadosVeiculos modelos = modelosDaMarca.get(i);
            json = consumo.obterDados(urlModelo + modelos.codigoVeiculo());
            DadosMarca dadosMarca = conversor.obterDados(json, DadosMarca.class);
            dadosFinais.add(dadosMarca);
        }

        dadosFinais.forEach(System.out::println);
 }

}
