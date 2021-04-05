package tn.windata.demo.entities;

import lombok.*;


import javax.persistence.*;
import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Compte {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String rib;
	private double solde;
	private double decouvert;
	private double mntAgios;
	private double seuilRemuneration;
	private double montantRemuneration;
	@ManyToOne(fetch = FetchType.LAZY)
	private Client client;
	
}
