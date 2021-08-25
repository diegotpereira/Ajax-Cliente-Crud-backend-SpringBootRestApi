package br.com.java.springbootrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.java.springbootrest.model.Compania;
import br.com.java.springbootrest.repository.CompaniaRepository;

@Service
public class CompaniaService {
    @Autowired
    private CompaniaRepository repo;

    public List<Compania> getCompaniaLista() {
        return repo.findAll();
    }

    public Compania getCompaniaById(Integer id) {
        return repo.findById(id).get();
    }

    public void salvarOuAtualizarCompania(Compania compania) {
        repo.save(compania);
    }

    public void deletarCompania(Integer id) {
        repo.deleteById(id);
    }
}
