package tn.windata.demo.entities;

import javax.persistence.*;

@Entity
@DiscriminatorValue("V")
public class Versement extends Transaction{
}
