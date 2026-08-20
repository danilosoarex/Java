package com.danilo.gerenciador_pedidos.service;

import com.danilo.gerenciador_pedidos.repository.CategoriaRepository;
import com.danilo.gerenciador_pedidos.repository.PedidoRepository;
import com.danilo.gerenciador_pedidos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class Principal implements CommandLineRunner {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public void run(String[] args) throws Exception {

        Produto produto = new Produto("Camisa do Corinthians", 250.00);
        Categoria categoria = new Categoria(1L, "Futebol");
        Pedido pedido = new Pedido(1L, LocalDate.now());

        produtoRepository.save(produto);
        pedidoRepository.save(pedido);
        categoriaRepository.save(categoria);

    }

}
