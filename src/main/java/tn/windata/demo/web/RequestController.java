package tn.windata.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.windata.demo.entities.Request;
import tn.windata.demo.service.IRequestService;

@RestController
public class RequestController {

	@Autowired
	IRequestService iRequeteService;

	@PostMapping("/request")
	public ResponseEntity<?> addRequete(@RequestBody Request requete) {

		return ResponseEntity.ok(iRequeteService.addRequete(requete));
	}
}
