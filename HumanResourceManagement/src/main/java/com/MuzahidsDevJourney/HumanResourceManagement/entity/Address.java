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
@Table(name="Address")
public class Address {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String street;
    private String city;
    private String state;
    private String postalCode;
    private String country;
    @JsonIgnore
    @OneToMany(mappedBy = "address") // Reference the "address" property in the Employee entity
    private List<Employee> employees = new ArrayList<>(); // Initialize the list
    
// // Constructor to initialize employees list
//    public Address(String street, String city, String state, String postalCode, String country) {
//        this.street = street;
//        this.city = city;
//        this.state = state;
//        this.postalCode = postalCode;
//        this.country = country;
  //  }

    

}
