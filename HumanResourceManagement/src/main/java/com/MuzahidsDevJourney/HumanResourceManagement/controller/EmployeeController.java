package com.MuzahidsDevJourney.HumanResourceManagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MuzahidsDevJourney.HumanResourceManagement.entity.Address;
import com.MuzahidsDevJourney.HumanResourceManagement.entity.Department;
import com.MuzahidsDevJourney.HumanResourceManagement.entity.Employee;
import com.MuzahidsDevJourney.HumanResourceManagement.entity.EmployeeRepository;
import com.MuzahidsDevJourney.HumanResourceManagement.repository.AddressRepository;
import com.MuzahidsDevJourney.HumanResourceManagement.repository.DepartmentRepository;

import jakarta.persistence.EntityNotFoundException;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello Muzahid";
	}
	@Autowired
	AddressRepository addressRepository;
	
	@Autowired
	EmployeeRepository empRepo;
	
	@Autowired
	DepartmentRepository departmentRepository;
	
	@GetMapping("/allEmployees")
	public List<Employee> GetAllEmployees(){
		return empRepo.findAll();
	}
	
	@PostMapping("/create")
    public Employee createEmployee(@RequestBody Employee employee) {

        // Save the address first
        Address savedAddress = addressRepository.save(employee.getAddress());
        employee.setAddress(savedAddress);

        // Save the department first
        Department savedDepartment = departmentRepository.save(employee.getDepartment());
        employee.setDepartment(savedDepartment);

        // Save the employee
        Employee savedEmployee = empRepo.save(employee);

        // Return the saved employee
        return savedEmployee;
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable long id) {
	    Optional<Employee> employee = empRepo.findById(id);
	    
	    if (employee.isPresent()) {
	        empRepo.delete(employee.get());
	    } else {
	        throw new EntityNotFoundException("Employee with ID " + id + " not found");
	    }
	}

	

		
		
	}


