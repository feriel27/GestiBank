package tn.windata.demo.entities;

import lombok.*;
import tn.windata.demo.entities.helper.*;

import javax.persistence.*;
@Data
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Type_OPER",
discriminatorType = DiscriminatorType.STRING,length = 4)
public class Transaction extends Auditable<String> {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codeOperation;
	private double montant;
	@ManyToOne
	private Compte  compte;
}
