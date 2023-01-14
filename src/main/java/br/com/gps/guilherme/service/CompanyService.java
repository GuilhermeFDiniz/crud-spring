package br.com.gps.guilherme.service;

import br.com.gps.guilherme.DTO.CompanyDTO;
import br.com.gps.guilherme.model.Company;
import br.com.gps.guilherme.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    public CompanyDTO findById(int id) throws Exception {
        Optional<Company> result = companyRepository.findById(id);
        if (result.isEmpty()) {
            throw new Exception("not found");
        }
        return new CompanyDTO(result.get());
    }

    public List<Company> listAllCompanies() {
        return companyRepository.findAll();
    }

    public void deleteCompany(int id) {
        companyRepository.deleteById(id);
    }

    public CompanyDTO createCompany(CompanyDTO companyDTO) {
        Company newCompany = new Company(companyDTO);
        Company savedCompany = companyRepository.save(newCompany);
        return new CompanyDTO(savedCompany);
    }

    public CompanyDTO updateCompany(int id, CompanyDTO companyDTO) {
        Optional<Company> result = companyRepository.findById(id);
        Company newCompany = new Company(companyDTO);
        if (result.isPresent()) {
            result.get().updateCompany(newCompany);
            Company savedEntity = companyRepository.save(result.get());
            return new CompanyDTO(savedEntity);
        }
        Company savedEntity = companyRepository.save(newCompany);
        return new CompanyDTO(savedEntity);
    }

}