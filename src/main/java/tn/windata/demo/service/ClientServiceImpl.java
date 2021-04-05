package tn.windata.demo.service;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import tn.windata.demo.config.*;
import tn.windata.demo.entities.*;
import tn.windata.demo.repo.*;

import java.util.*;
@Service
public class ClientServiceImpl implements IClientService{
	
	@Autowired
	IClientRepo iClientRepo;

	
	
	@Override
	public Client addClient (Client client) {
	
		return iClientRepo.save(client);
	}
	
	@Override
	public List<Client> getClients () {
		return iClientRepo.findAll();
	}
}
