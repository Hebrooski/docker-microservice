package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repositories.EmployeeRepository;
import com.example.demo.repositories.EmployeeSaleRepository;
import com.example.demo.entities.EmployeeSale;
import com.example.demo.entities.Employee;


@RestController
@RequestMapping("/employees")
@CrossOrigin(origins = "http://localhost:8080") // Allows requests from this origin
public class EmployeesController {

    @Autowired
    private final EmployeeRepository employeeRepository;
    @Autowired
    private final EmployeeSaleRepository employeeSaleRepository;

    EmployeesController(EmployeeRepository employeeRepository,EmployeeSaleRepository employeeSaleRepository){
        this.employeeRepository = employeeRepository;
        this.employeeSaleRepository = employeeSaleRepository;
    }

    @GetMapping("/test-employees")
    public String testEmployees(){
        return "this returned!";
    }

    @GetMapping("/get-employees")
    public Iterable<Employee> getEmployees(){
        return employeeRepository.findAll();
    }

    @GetMapping("/get-employee-sales")
    public Iterable<EmployeeSale> getEmployeeSales(){
        return employeeSaleRepository.findAll();
    }

    
}
