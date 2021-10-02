package com.supermarket.bestchoice.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Categorie implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "NAME_CATEGORIE")
	private String nameCategorie;

	public Categorie(Integer id, String nameCategorie) {
		super();
		this.id = id;
		this.nameCategorie = nameCategorie;
	}	
}
