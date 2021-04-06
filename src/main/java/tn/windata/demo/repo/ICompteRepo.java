package tn.windata.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.windata.demo.entities.Compte;

@Repository
public interface ICompteRepo extends JpaRepository<Compte,Long> {
}
