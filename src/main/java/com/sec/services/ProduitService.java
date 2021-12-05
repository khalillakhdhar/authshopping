package com.sec.services;

import java.util.List;
import java.util.Optional;

import com.sec.model.Produit;

public interface ProduitService {
public Produit saveproduct(Produit p);
public List<Produit> showProducts();
public Optional<Produit> chercherparID(long id);
public Produit chercherparTitre(String titre);
public List<Produit> chercherParDescription(String description);
public void deleteProduit(long id);
}
