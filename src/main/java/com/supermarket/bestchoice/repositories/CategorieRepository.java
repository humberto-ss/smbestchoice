package com.supermarket.bestchoice.repositories;

import com.supermarket.bestchoice.domain.Categorie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Integer>{
    
}
