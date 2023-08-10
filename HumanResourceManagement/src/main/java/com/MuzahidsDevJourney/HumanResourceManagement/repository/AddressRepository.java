package com.MuzahidsDevJourney.HumanResourceManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MuzahidsDevJourney.HumanResourceManagement.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
	//@Query("SELECT a FROM Address a JOIN FETCH a.employees WHERE a.id = :addressId")
  //  Address findByIdWithEmployees(@Param("addressId") Long addressId);

}
