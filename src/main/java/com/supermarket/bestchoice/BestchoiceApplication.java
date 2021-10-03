package com.supermarket.bestchoice;

import java.util.Arrays;

import com.supermarket.bestchoice.domain.Categorie;
import com.supermarket.bestchoice.domain.City;
import com.supermarket.bestchoice.domain.Product;
import com.supermarket.bestchoice.domain.State;
import com.supermarket.bestchoice.repositories.CategorieRepository;
import com.supermarket.bestchoice.repositories.CityRepository;
import com.supermarket.bestchoice.repositories.ProductRepository;
import com.supermarket.bestchoice.repositories.StateRepository;

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

	@Autowired
	private StateRepository stateRepository;

	@Autowired
	private CityRepository cityRepository;

	public static void main(String[] args) {
		SpringApplication.run(BestchoiceApplication.class, args);
	}

	public void run(String... s) throws Exception{

		createProductsAndCategories();
		createStateAndCities();
	}

	private void createStateAndCities(){
		State s1 = new State(null, "Rio Grande do Sul");
		State s2 = new State(null, "Santa Catarina");
		State s3 = new State(null, "Paraná");

		City c1 = new City(null, "Porto Alegre", s1);
		City c2 = new City(null, "Canoas", s1);
		City c3 = new City(null, "Gravatai", s1);
		
		City c4 = new City(null, "Florianopolis", s2);
		City c5 = new City(null, "Criciuma", s2);
		City c6 = new City(null, "Garopaba", s2);

		City c7 = new City(null, "Curitiba", s3);
		City c8 = new City(null, "Ilha Bela", s3);

		s1.getCities().addAll(Arrays.asList(c1,c2,c3));
		s2.getCities().addAll(Arrays.asList(c4,c5,c6));
		s3.getCities().addAll(Arrays.asList(c7,c8));

		stateRepository.saveAll(Arrays.asList(s1,s2,s3));
		cityRepository.saveAll(Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8));

	}

	private void createProductsAndCategories(){
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
