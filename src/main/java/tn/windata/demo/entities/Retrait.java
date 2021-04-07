package tn.windata.demo.entities;


import lombok.*;

import javax.persistence.*;

@Entity
@DiscriminatorValue("R")
@Data
public class Retrait extends Operation {
}
