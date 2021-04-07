package tn.windata.demo.entities;


import lombok.*;

import javax.persistence.*;

@Entity
@DiscriminatorValue("R")
public class Retrait extends Transaction {
}
