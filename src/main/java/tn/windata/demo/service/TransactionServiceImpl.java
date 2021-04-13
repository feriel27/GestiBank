package tn.windata.demo.service;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import tn.windata.demo.entities.*;
import tn.windata.demo.exception.*;
import tn.windata.demo.repo.*;

import java.util.*;

@Service
public class TransactionServiceImpl implements ITransactionService {
	@Autowired
	ITransactionRepo iTransactionRepo;
	@Autowired
	ICompteRepo compteRepo;
	
	@Override
	public Operation addTransaction (TransactionType operation, double montant, List<Compte> comptes) throws SoldeNotFoundException {
		Compte compte1=compteRepo.findById(comptes.get(0).getId()).get();
		
		switch (operation){
			case RETRAIT : {
				return iTransactionRepo.save(retrait(montant, compte1));
				
			}
			case VERSEMENT:{
				return iTransactionRepo.save(versement(montant, compte1));
			}
			case VIREMENT:{
			Operation op=new Virement();
				Compte compte2=compteRepo.findById(comptes.get(1).getId()).get();
				retrait(montant, compte1);
				versement(montant, compte2);
				op.setDebiteur(compte2);
				op.setCrediteur(compte1);
				op.setMontant(montant);
				return iTransactionRepo.save(op);
			}
			default:
				return null;
		}
	}
	
	private Operation versement (double montant, Compte compte1) {
		Operation operation1= new Versement();
		compte1.setSolde(compte1.getSolde()+montant);
		operation1.setDebiteur(compte1);
		operation1.setMontant(montant);
		compteRepo.save(compte1);
		return operation1;
	}

	
	private Operation retrait (double montant, Compte compte1) throws SoldeNotFoundException {
		if (compte1.getDecouvert()+compte1.getSolde()-montant>0){
			Operation	operation1= new Retrait();
			compte1.setSolde(compte1.getSolde()-montant);
			operation1.setCrediteur(compte1);
			operation1.setMontant(montant);
			compteRepo.save(compte1);
			return operation1;
		}else {
			System.out.println("retrait impossible");
			throw new SoldeNotFoundException("retrait impossible");
		}
	}
}
