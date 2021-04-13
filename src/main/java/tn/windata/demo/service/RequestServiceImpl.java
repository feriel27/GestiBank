package tn.windata.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.windata.demo.entities.Request;
import tn.windata.demo.repo.IRequestRepo;

@Service
public class RequestServiceImpl implements IRequestService {
	
	@Autowired
	IRequestRepo iRequeteRepo;

	@Override
	public Request addRequete(Request requete) {
		return iRequeteRepo.save(requete);
	}

}
