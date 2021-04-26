package tn.windata.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.windata.demo.entities.Compte;
import tn.windata.demo.service.ICompteService;

@RestController
public class CompteController {
	@Autowired
	ICompteService CompteService;
	
	@PostMapping("/compte")
	public ResponseEntity<?> addCompte (@RequestBody Compte compte) {
		
		return ResponseEntity.ok(CompteService.addCompte(compte));
	}

	@GetMapping("/comptes/{id}")
	public ResponseEntity<?> findCompte (@PathVariable Long id) {
		return ResponseEntity.ok(CompteService.getCompteById(id));
	}
	
	@GetMapping("/comptes/findComptesByClient/{id}")
	public ResponseEntity<?> findListCompteByClient (@PathVariable Long id) {
		
		List<Compte> allComptes = CompteService.findAllByClient(id);
			return ResponseEntity.ok(allComptes);
		}
}
