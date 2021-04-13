package tn.windata.demo.web;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import tn.windata.demo.entities.*;
import tn.windata.demo.service.*;

import java.util.*;


@RestController
public class ClientController {
	
	@Autowired
	IClientService clientService;
	
	@PostMapping("/client")
	public ResponseEntity<?> addClient (@RequestBody Client client) {
		
		return ResponseEntity.ok(clientService.addClient(client));
	}
	
	@GetMapping("/clients")
	public ResponseEntity<?> getClients (@RequestParam(defaultValue = "0") int page,
	                                     @RequestParam(defaultValue = "3") int size) {
		Map<String, Object> allClients = clientService.getAllClients(page, size);
		return ResponseEntity.ok(allClients);
	}
	
	@GetMapping("/clients/{value}")
	public ResponseEntity<?> findClient (@PathVariable String value) {
		return ResponseEntity.ok(clientService.findByEmailOrNomOrPrenomContaining(value));
	}
}
