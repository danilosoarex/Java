package com.danilo.gerenciador_pedidos.repository;

import com.danilo.gerenciador_pedidos.service.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
