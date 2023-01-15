package br.com.gps.guilherme.controller;

import br.com.gps.guilherme.DTO.CompanyDTO;
import br.com.gps.guilherme.model.Company;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import br.com.gps.guilherme.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;

import java.util.List;

@RestController
@RequestMapping("company") //localhost:8080/company/
public class CompanyController {
    @Autowired
    CompanyService companyService;
    @GetMapping("/list")
    public ResponseEntity<List<CompanyDTO>> listAllCompanies() {
        return new ResponseEntity(companyService.listAllCompanies(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<CompanyDTO> getCompany(@PathVariable("id") int companyId) throws Exception {
        try{
            CompanyDTO result = companyService.findById(companyId);
            return new ResponseEntity(result, HttpStatus.OK);
        }catch(EmptyResultDataAccessException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity deleteCompany(@PathVariable("id") int id) {
        try{
            companyService.deleteCompany(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }catch(EmptyResultDataAccessException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping()
    public ResponseEntity<CompanyDTO> createCompany(@RequestBody CompanyDTO company) {
        return new ResponseEntity<>(companyService.createCompany(company), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CompanyDTO> updateCompany(@PathVariable("id") int id, @RequestBody CompanyDTO company) {
        return new ResponseEntity<>(companyService.updateCompany(id, company), HttpStatus.ACCEPTED);
    }
}