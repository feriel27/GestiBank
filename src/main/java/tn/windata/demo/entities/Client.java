package tn.windata.demo.entities;


import lombok.*;


import javax.persistence.*;
import java.util.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Client extends Utilisateur {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String pieceJustified;
	@OneToMany(mappedBy = "client")
	private List<Compte> comptes;

	
}
