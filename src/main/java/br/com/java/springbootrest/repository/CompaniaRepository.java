package br.com.java.springbootrest.repository;

import br.com.java.springbootrest.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompaniaRepository extends JpaRepository<Compania, Integer> {
    
}
