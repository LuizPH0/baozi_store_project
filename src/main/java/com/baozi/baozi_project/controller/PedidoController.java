package com.baozi.baozi_project.controller;

import com.baozi.baozi_project.model.Pedido;
import com.baozi.baozi_project.repository.PedidoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoRepository repository;

    public PedidoController(PedidoRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Pedido criar(@RequestBody Pedido pedido){
        return repository.save(pedido);
    }

    @GetMapping
    public List<Pedido> listar(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Pedido buscar(@PathVariable Long id){
        return repository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        repository.deleteById(id);
    }
}
