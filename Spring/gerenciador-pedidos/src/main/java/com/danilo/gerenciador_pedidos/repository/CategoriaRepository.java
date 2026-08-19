package com.danilo.gerenciador_pedidos.repository;

import com.danilo.gerenciador_pedidos.service.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
