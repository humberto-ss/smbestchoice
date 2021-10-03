package com.supermarket.bestchoice.services;

import java.util.Optional;

import com.supermarket.bestchoice.domain.Categorie;
import com.supermarket.bestchoice.repositories.CategorieRepository;
import com.supermarket.bestchoice.services.exceptions.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategorieService {

    @Autowired
    private CategorieRepository repo;


    public Categorie getCategorie(Integer id) {
        Optional<Categorie> cat = repo.findById(id);
        return cat.orElseThrow(()-> new ObjectNotFoundException(
                                "Object Not Found. ID: "+ id 
                                + ", Type of " + Categorie.class.getName()
                                ));
    }
}
