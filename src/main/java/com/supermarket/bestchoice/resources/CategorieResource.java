package com.supermarket.bestchoice.resources;

import java.util.ArrayList;
import java.util.List;

import com.supermarket.bestchoice.domain.Categorie;
import com.supermarket.bestchoice.services.CategorieService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categories")
public class CategorieResource {

	@Autowired
	private CategorieService service;
	
	@GetMapping
	public List<Categorie> listAll() {
		Categorie cat1 = new Categorie(1, "Fruits");
		Categorie cat2 = new Categorie(2, "Vegetables");
		
		List<Categorie>listCategories = new ArrayList<>();
		listCategories.add(cat1);
		listCategories.add(cat2);
		
		return listCategories;
	}

	@GetMapping(path = "/{id}")
	public ResponseEntity<?> getCategorie(@PathVariable Integer id) {
		Categorie cat =  service.getCategorie(id);
		return ResponseEntity.ok().body(cat);
	}
}
