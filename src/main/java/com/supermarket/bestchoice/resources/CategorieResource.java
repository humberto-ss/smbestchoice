package com.supermarket.bestchoice.resources;

import java.util.ArrayList;
import java.util.List;

import com.supermarket.bestchoice.domain.Categorie;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categories")
public class CategorieResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Categorie> list() {
		Categorie cat1 = new Categorie(1, "Fruits");
		Categorie cat2 = new Categorie(2, "Vegetables");
		
		List<Categorie>listCategories = new ArrayList<>();
		listCategories.add(cat1);
		listCategories.add(cat2);
		
		return listCategories;
	}
}
