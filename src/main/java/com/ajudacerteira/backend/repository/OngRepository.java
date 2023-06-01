package com.ajudacerteira.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajudacerteira.backend.entities.Ong;

public interface OngRepository extends JpaRepository<Ong, Long>{
    
}
