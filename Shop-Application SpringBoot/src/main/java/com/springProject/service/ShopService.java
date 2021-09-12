package com.springProject.service;

import java.util.List;

import com.springProject.entities.Address;
import com.springProject.entities.Employee;

public interface ShopService {

	public List<Employee> getAllEmployees();

	public Employee getEmployeeById(long id);

	public Address getShopAddress(long id);

}
