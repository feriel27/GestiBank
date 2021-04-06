package tn.windata.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.windata.demo.entities.Client;
import tn.windata.demo.entities.Compte;
import tn.windata.demo.repo.ICompteRepo;

@Service
public class CompteServiceImpl implements ICompteService{

	@Autowired
	ICompteRepo iCompteRepo;

	
	@Override
	public Compte addCompte(Compte compte) {
		return iCompteRepo.save(compte);

	}
	@Override
	public Optional<Compte> getCompteById (Long id) {
		return iCompteRepo.findById( id);
	}
}
