package com.sec.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sec.model.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
public Produit findByTitre(String titre);
public List<Produit> findByDescriptionLike(String description);
}
