package com.sec.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.sun.istack.internal.NotNull;

@Entity
public class Produit {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Enumerated(EnumType.STRING)
@Column(length = 4)
private Livraison livraison;
@NotNull
@Column(unique = true)
private String titre;
@NotBlank
@Column(nullable = false)
private String description;
@ManyToOne(fetch = FetchType.LAZY,optional = false )
@JoinColumn(name = "id_categorie",nullable = false)
@OnDelete(action = OnDeleteAction.CASCADE)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
@JsonProperty("id_categorie")
private Categorie categorie;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public Livraison getLivraison() {
	return livraison;
}
public void setLivraison(Livraison livraison) {
	this.livraison = livraison;
}
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Categorie getCategorie() {
	return categorie;
}
public void setCategorie(Categorie categorie) {
	this.categorie = categorie;
}

}
