package tn.windata.demo.service;

import java.util.Optional;

import tn.windata.demo.entities.Compte;

public interface ICompteService {

	Compte addCompte(Compte compte);
	Optional<Compte>  getCompteById(Long id);

}
