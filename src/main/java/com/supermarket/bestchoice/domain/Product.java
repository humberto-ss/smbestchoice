package com.supermarket.bestchoice.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.JoinColumn;




@Entity
@Data
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    
    @ManyToMany
    @JoinTable(
		name="PRODUCT_CATEGORIE"
		, joinColumns = @JoinColumn(name="ID_CATEGORIE")
		, inverseJoinColumns = @JoinColumn(name="ID_PRODUCT")
		)
    private List<Categorie> categories = new ArrayList<>();

    public Product(Integer id, String name, String description){
        this.id = id;
        this.name = name;
        this.description = description;
    }
}
