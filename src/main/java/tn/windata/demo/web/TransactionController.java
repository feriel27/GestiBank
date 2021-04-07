package tn.windata.demo.web;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import tn.windata.demo.entities.*;
import tn.windata.demo.exception.*;
import tn.windata.demo.service.*;

import java.util.*;

@RestController
public class TransactionController {

	@Autowired
	ITransactionService transactionService;
	
	@PostMapping("transaction/{op}/{montant}")
	ResponseEntity<?> addVersement(@PathVariable int op, @PathVariable double montant,
	                               @RequestBody List<Compte> comptes ){
	
		try {
			Operation operation = transactionService.addTransaction(TransactionType.values()[op], montant, comptes);
			return ResponseEntity.ok(operation);
		} catch (SoldeNotFoundException e) {
			return ResponseEntity.ok(e.getMessage().toString());
		}
		
	}
}
