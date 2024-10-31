package com.example.TpwebService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TpwebService.entite.Compte;

public interface CompteRepository extends JpaRepository<Compte, Long>{

}
