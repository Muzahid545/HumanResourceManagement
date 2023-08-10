package com.MuzahidsDevJourney.HumanResourceManagement.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	// Custom queries or methods if needed

}
