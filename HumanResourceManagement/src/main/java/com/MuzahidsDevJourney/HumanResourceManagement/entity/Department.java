package com.MuzahidsDevJourney.HumanResourceManagement.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name="department")

public class Department {
	
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;

	    private String name;
	    @JsonIgnore
	    @OneToMany(mappedBy = "department") // Reference the "department" property in the Employee entity
	    private List<Employee> employees = new ArrayList<>(); // Initialize the list
//
//	 // Constructor to initialize employees list
//	    public Department(String name) {
//	        this.name = name;
//	    }

}
