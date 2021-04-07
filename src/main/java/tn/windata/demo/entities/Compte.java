package tn.windata.demo.entities;

import lombok.*;
import tn.windata.demo.entities.helper.*;


import javax.persistence.*;
import javax.persistence.Entity;
import java.util.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Compte extends Auditable<String> {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String rib;
	private double solde;
	private double decouvert;
	private double mntAgios;
	private double seuilRemuneration;
	private double montantRemuneration;
	@ManyToOne(fetch = FetchType.EAGER)
	private Client client;
	
}
