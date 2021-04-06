package tn.windata.demo.service;

import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;
import org.springframework.stereotype.*;
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
	
	@Override
	public List<Client> findByEmailOrNomOrPrenomContaining (String value) {
		return iClientRepo.findByEmailContainingOrNomContainingOrPrenomContaining(value,value,value);
	}
	
	@Override
	public Map<String, Object> getAllClients (int page, int size) {
		Pageable paging = PageRequest.of(page, size);
		Page<Client> clientPage = iClientRepo.findAll(paging);
		List<Client> clients = clientPage.getContent();
		return getMapResponseEntity(clients, clientPage);
	}
	
	private Map<String, Object> getMapResponseEntity (List<Client> clients, Page<Client> clientPage) {
		Map<String, Object> result = new HashMap<>();
		result.put("users", clients);
		result.put("currentPage", clientPage.getNumber());
		result.put("totalItems", clientPage.getTotalElements());
		result.put("totalPages", clientPage.getTotalPages());
		
		return result;
	}
}
