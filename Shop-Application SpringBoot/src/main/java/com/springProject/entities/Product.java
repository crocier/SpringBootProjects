package com.springProject.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	@Id
	private long id;
	private String name;
	private float price;
	
	@OneToOne
	private Brand brand;
	
	private ProductType productType;
}
