package com.baozi.baozi_project.repository;


import com.baozi.baozi_project.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}