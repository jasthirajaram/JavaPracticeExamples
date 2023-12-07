package com.billing.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "AWS")
public class Aws {

	@Id
	private String id;
	@Field(name = "StartDate")
	private String startDate;
	@Field(name = "EndDate")
	private String endDate;
	@Field(name = "Service")
	private String service;
	@Field(name = "BlendedCost")
    private double blendedCose;
    
}
