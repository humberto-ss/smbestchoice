package com.supermarket.bestchoice;

import java.util.Arrays;

import com.supermarket.bestchoice.domain.Categorie;
import com.supermarket.bestchoice.domain.Product;
import com.supermarket.bestchoice.repositories.CategorieRepository;
import com.supermarket.bestchoice.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BestchoiceApplication implements CommandLineRunner{

	@Autowired
	private CategorieRepository categorieRepository;

	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(BestchoiceApplication.class, args);
	}

	public void run(String... s) throws Exception{
		Categorie cat1 = new Categorie(null, "Fruits");
		Categorie cat2 = new Categorie(null, "Vegetables");
		Categorie cat3 = new Categorie(null, "Eletronics");

		Product p1 = new Product(null, "Banana", "Caturra");
		Product p2 = new Product(null, "Tomato", "Gaucho");
		Product p3 = new Product(null, "HDMI Cable", "Cable used to conect screen devices");
		
		
		p1.getCategories().addAll(Arrays.asList(cat1));
		p2.getCategories().addAll(Arrays.asList(cat2, cat1));
		p3.getCategories().addAll(Arrays.asList(cat3));
		
		cat1.getProducts().addAll(Arrays.asList(p1, p2));
		cat2.getProducts().addAll(Arrays.asList(p2));
		cat3.getProducts().addAll(Arrays.asList(p3));

		
		categorieRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		
		productRepository.saveAll(Arrays.asList(p1,p2,p3));
	}

}
