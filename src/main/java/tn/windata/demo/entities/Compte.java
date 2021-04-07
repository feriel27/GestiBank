package tn.windata.demo.entities;

import lombok.*;
import tn.windata.demo.entities.helper.*;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	
	@OneToMany(mappedBy = "compte")
	@JsonIgnore
	private List<Request> requetes;
	
}
