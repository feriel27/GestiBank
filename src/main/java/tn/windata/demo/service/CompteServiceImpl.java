package tn.windata.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
