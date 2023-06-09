package com.ajudacerteira.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajudacerteira.backend.entities.Evento;
import com.ajudacerteira.services.EventoService;

@RestController
@RequestMapping(value = "/eventos")
public class EventoController {
    
    @Autowired
    private EventoService service;

    @GetMapping
    public List<Evento> findAll(){
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public Evento findById(@PathVariable Long id){
        return service.findById(id);
    }

    @PostMapping
    public Evento saveEvento(@RequestBody Evento evento){
        return service.saveEvento(evento);
    }

    @PutMapping("/{id}")
    public Evento updateEvento(@PathVariable Long id, @RequestBody Evento evento){
        return service.updateEvento(id, evento);
    }

    @DeleteMapping("/{id}")
    public void deleteEvento(@PathVariable Long id){
        service.deleteEvento(id);
    }
}
