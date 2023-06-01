package com.ajudacerteira.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajudacerteira.backend.entities.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long> {
    
}
