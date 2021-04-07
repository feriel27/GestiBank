package tn.windata.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.windata.demo.entities.Client;
import tn.windata.demo.entities.Compte;
import tn.windata.demo.repo.IClientRepo;
import tn.windata.demo.repo.ICompteRepo;

@Service
public class CompteServiceImpl implements ICompteService{

	@Autowired
	ICompteRepo iCompteRepo;

	@Autowired
	IClientRepo iClientRepo;
	
	@Override
	public Compte addCompte(Compte compte) {
		return iCompteRepo.save(compte);

	}
	@Override
	public Compte getCompteById (Long id) {
		return iCompteRepo.findById( id).get();
	}
	@Override
	public List<Compte> findAllByClient(Long id) {
		Client client = iClientRepo.findById(id).get() ;
		return iCompteRepo.findAllByClient(client);
	}
	
}
