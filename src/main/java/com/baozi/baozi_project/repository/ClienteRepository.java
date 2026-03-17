package com.baozi.baozi_project.repository;

import com.baozi.baozi_project.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
