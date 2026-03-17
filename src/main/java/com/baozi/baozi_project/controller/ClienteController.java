package com.baozi.baozi_project.controller;

import com.baozi.baozi_project.model.Cliente;
import com.baozi.baozi_project.repository.ClienteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteRepository repository;

    public ClienteController(ClienteRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Cliente criar(@RequestBody Cliente cliente){
        return repository.save(cliente);
    }

    @GetMapping
    public List<Cliente> listar(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Cliente buscar(@PathVariable Long id){
        return repository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        repository.deleteById(id);
    }
}
