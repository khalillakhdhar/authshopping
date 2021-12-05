package com.sec.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sec.model.Produit;
import com.sec.model.repository.ProduitRepository;

@Service
public class ProduitServiceImp implements ProduitService {
@Autowired
private ProduitRepository produitRepository;


	@Override
	public Produit saveproduct(Produit p) {
		// TODO Auto-generated method stub
		return produitRepository.save(p);
	}

	@Override
	public List<Produit> showProducts() {
		// TODO Auto-generated method stub
		return produitRepository.findAll();
	}

	@Override
	public Optional<Produit> chercherparID(long id) {
		// TODO Auto-generated method stub
		return produitRepository.findById(id);
	}

	@Override
	public Produit chercherparTitre(String titre) {
		// TODO Auto-generated method stub
		return produitRepository.findByTitre(titre);
	}

	@Override
	public List<Produit> chercherParDescription(String description) {
		// TODO Auto-generated method stub
		return produitRepository.findByDescriptionLike("%"+description+"%");
	}

	@Override
	public void deleteProduit(long id) {
		// TODO Auto-generated method stub
		produitRepository.deleteById(id);

	}

}
