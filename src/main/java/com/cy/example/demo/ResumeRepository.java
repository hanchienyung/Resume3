package com.cy.example.demo;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface ResumeRepository extends CrudRepository<Resume, Long>{
   List <Resume> findAll() ;
}
