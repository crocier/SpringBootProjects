package com.springProject.serviceImpl;

import com.springProject.entities.Address;
import com.springProject.entities.Employee;
import com.springProject.repository.AddressRepository;
import com.springProject.repository.EmployeeRepository;
import com.springProject.service.ShopService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopServiceImpl implements ShopService {

	@Autowired
	EmployeeRepository empRepo;

	@Autowired
	AddressRepository addRepo;

	@Override
	public List<Employee> getAllEmployees() {
		return empRepo.getAllEmployees();
	}

	@Override
	public Employee getEmployeeById(long id) {
		return empRepo.getEmployeeById(id);
	}

	@Override
	public Address getShopAddress(long id) {
		return addRepo.getShopAddressById(id);
	}

}
