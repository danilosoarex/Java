package com.danilo.gerenciador_pedidos;

import com.danilo.gerenciador_pedidos.repository.CategoriaRepository;
import com.danilo.gerenciador_pedidos.repository.PedidoRepository;
import com.danilo.gerenciador_pedidos.repository.ProdutoRepository;
import com.danilo.gerenciador_pedidos.service.Categoria;
import com.danilo.gerenciador_pedidos.service.Pedido;
import com.danilo.gerenciador_pedidos.service.Principal;
import com.danilo.gerenciador_pedidos.service.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class GerenciadorPedidosApplication {

	public static void main(String[] args) {
		SpringApplication.run(GerenciadorPedidosApplication.class, args);
	}

}
