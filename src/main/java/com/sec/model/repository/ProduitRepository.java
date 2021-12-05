package com.sec.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sec.model.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
