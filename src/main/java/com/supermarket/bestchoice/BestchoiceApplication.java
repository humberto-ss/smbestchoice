package com.supermarket.bestchoice;

import java.util.Arrays;

import com.supermarket.bestchoice.domain.Categorie;
import com.supermarket.bestchoice.repositories.CategorieRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BestchoiceApplication implements CommandLineRunner{

	@Autowired
	private CategorieRepository categorieRepository;

	public static void main(String[] args) {
		SpringApplication.run(BestchoiceApplication.class, args);
	}

	public void run(String... s) throws Exception{
		Categorie cat1 = new Categorie(null, "Fruits");
		Categorie cat2 = new Categorie(null, "Vegetables");

		categorieRepository.saveAll(Arrays.asList(cat1, cat2));

	}

}
