package com.springProject.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shop {
	
	@Id
	private long id;
	private String name;
	
	@OneToOne
	private Address address;
	
	@OneToMany
	private List<Product> products;
	
	@OneToMany
	private List<Employee> employees;
	
	@OneToMany
	private List<Customer> customers;

}
