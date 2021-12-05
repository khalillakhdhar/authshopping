package com.sec.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Categorie {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Column(unique = true)
private String categorie;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getCategorie() {
	return categorie;
}
public void setCategorie(String categorie) {
	this.categorie = categorie;
}

}
