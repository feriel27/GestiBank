package tn.windata.demo.service;


import java.util.List;

import tn.windata.demo.entities.Compte;

public interface ICompteService {

	Compte addCompte(Compte compte);
	Compte  getCompteById(Long id);
	List<Compte> findAllByClient (Long  id);

}
