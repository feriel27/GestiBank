package tn.windata.demo.entities;

import javax.persistence.*;

import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Request {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String status;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Compte compte;
	
	@Enumerated(EnumType.STRING)
	private TypeRequest typeRequest;
}
