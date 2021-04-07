package tn.windata.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import tn.windata.demo.entities.Request;

@Repository
public interface IRequestRepo extends JpaRepository<Request, Long> {


}