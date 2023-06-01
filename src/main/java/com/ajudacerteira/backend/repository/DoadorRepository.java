package com.ajudacerteira.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajudacerteira.backend.entities.Doador;

public interface DoadorRepository extends JpaRepository<Doador, Long>{
    
}
