package com.danilo.gerenciador_pedidos.repository;

import com.danilo.gerenciador_pedidos.service.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
