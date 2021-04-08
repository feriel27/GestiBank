package tn.windata.demo.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@DiscriminatorValue("V")
@Data
public class Versement extends Operation {
}
