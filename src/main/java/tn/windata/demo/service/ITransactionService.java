package tn.windata.demo.service;


import tn.windata.demo.entities.*;
import tn.windata.demo.exception.*;

import java.util.*;

public interface ITransactionService {
	
	Operation addTransaction(TransactionType op, double montant, List<Compte> comptes) throws SoldeNotFoundException;
}
