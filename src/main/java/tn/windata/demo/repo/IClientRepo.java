package tn.windata.demo.repo;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;
import tn.windata.demo.entities.*;

@Repository
public interface IClientRepo extends JpaRepository<Client,Long> {
}
