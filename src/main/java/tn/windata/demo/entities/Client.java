package tn.windata.demo.entities;


import lombok.*;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Client extends Utilisateur {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String pieceJustified;
	
	@OneToMany(mappedBy = "client")
	@JsonIgnore
	private List<Compte> comptes;
	@Override
	public String toString() {
		return "Client [id=" + id + ", pieceJustified=" + pieceJustified + "]";
	}

	
}
