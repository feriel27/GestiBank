package tn.windata.demo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.windata.demo.entities.Client;
import tn.windata.demo.entities.Compte;

import java.util.*;

@Repository
public interface ICompteRepo extends JpaRepository<Compte,Long> {

	List<Compte> findAllByClient(Client client);

}
