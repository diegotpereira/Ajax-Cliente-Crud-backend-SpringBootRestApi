package br.com.java.springbootrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.java.springbootrest.model.Compania;
import br.com.java.springbootrest.service.CompaniaService;

@RestController
@CrossOrigin(origins = "*")
public class CompaniaController {
    @Autowired
    private CompaniaService service;

    @GetMapping(value = "/companiaLista")
    public ResponseEntity<List<Compania>> getCompaniaLista() {
        return new ResponseEntity<List<Compania>>(service.getCompaniaLista(), HttpStatus.OK);
    }

    @GetMapping("/compania/{id}")
    public ResponseEntity<Compania> getCompania(@PathVariable Integer id) {
        return new ResponseEntity<Compania>(service.getCompaniaById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/compania/salvar")
    public ResponseEntity<Void> salvarOuAtualizarCompania(@RequestBody Compania compania) {
        service.salvarOuAtualizarCompania(compania);

        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @DeleteMapping("/compania/deletar/{id}")
    public ResponseEntity<Void> deletarCompania(@PathVariable Integer id) {
        service.deletarCompania(id);

        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}
