package br.com.gps.guilherme.repository;

import br.com.gps.guilherme.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Integer> {
}