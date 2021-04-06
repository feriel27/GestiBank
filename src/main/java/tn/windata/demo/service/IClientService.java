package tn.windata.demo.service;

import tn.windata.demo.entities.*;

import java.util.*;


public interface IClientService {
	Client addClient(Client client);
	List<Client> getClients();
	List<Client> findByEmailOrNomOrPrenomContaining(String value);
	Map<String, Object> getAllClients (int page, int size);
}
