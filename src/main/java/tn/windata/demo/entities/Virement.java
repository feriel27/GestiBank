package tn.windata.demo.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@DiscriminatorValue("VM")
@Data
public class Virement extends Operation{
}
