package tn.windata.demo.entities;

import lombok.*;
import tn.windata.demo.entities.helper.*;

import javax.persistence.*;


@Data
@ToString
@MappedSuperclass
public abstract class Utilisateur extends Auditable<String> {
	
	private String nom;
	private String prenom;
	private String email;
	private String adress;
	private String telephone;
	private String pseudo;
	private String motdepass;
	
	
}
