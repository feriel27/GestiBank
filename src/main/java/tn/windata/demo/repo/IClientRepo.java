package tn.windata.demo.repo;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;
import tn.windata.demo.entities.*;

import java.util.*;

@Repository
public interface IClientRepo extends JpaRepository<Client,Long> {
	List<Client> findByEmailContainingOrNomContainingOrPrenomContaining (String email, String nom, String prenom);
	Page<Client> findAll (Pageable page);
}
