package tn.windata.demo.web;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import tn.windata.demo.entities.*;
import tn.windata.demo.service.*;



@RestController
public class clientController {
	
	@Autowired
	IClientService clientService;
	
	@PostMapping("/client")
	public ResponseEntity<?> addClient (@RequestBody Client client) {
		
		return ResponseEntity.ok(clientService.addClient(client));
	}
	
	@GetMapping("/client")
	public ResponseEntity<?> getClients () {
		return ResponseEntity.ok(clientService.getClients());
	}
}
