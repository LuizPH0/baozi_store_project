package com.baozi.baozi_project.repository;


import com.baozi.baozi_project.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}