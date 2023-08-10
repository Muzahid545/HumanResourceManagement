package com.MuzahidsDevJourney.HumanResourceManagement.entity;

import java.math.BigDecimal;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class Salary {
	
	 private BigDecimal amount;
	    private String currency;

	
	
}
