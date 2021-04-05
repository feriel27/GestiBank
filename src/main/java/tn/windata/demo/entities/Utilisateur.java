package tn.windata.demo.entities;

import lombok.*;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@MappedSuperclass
public class Utilisateur {
	
	private String nom;
	private String prenom;
	private String email;
	private String adress;
	private String telephone;
	private String pseudo;
	private String motdepass;
	
	
}
