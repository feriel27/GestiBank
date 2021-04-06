package tn.windata.demo.entities.helper;

import lombok.*;
import org.springframework.data.annotation.*;
import org.springframework.data.jpa.domain.support.*;

import javax.persistence.*;
import java.util.*;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Data
public abstract class Auditable<String> {
	@LastModifiedDate
	private Date updatedAt;
	
	@CreatedDate
	private Date createdAt;
}
