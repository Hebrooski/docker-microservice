package com.example.demo.repositories;

import com.example.demo.entities.EmployeeSale;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeSaleRepository extends CrudRepository<EmployeeSale, Integer> {

}
