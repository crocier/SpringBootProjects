package com.springProject.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springProject.entities.Address;
import com.springProject.entities.Employee;
import com.springProject.service.ShopService;

@RestController
public class ShopController {

	@Autowired
	ShopService service;

	@GetMapping("/employees")
	@ResponseBody
	public List<Employee> getAllEmployees() {
		return service.getAllEmployees();
	}

	@GetMapping("/employees/{id}")
	@ResponseBody
	public ResponseEntity<?> getEmployeeById(@PathVariable(value = "id") long id) {

		ResponseEntity<?> response;

		response = new ResponseEntity<Employee>(service.getEmployeeById(id), HttpStatus.OK);

		return response;
	}

	@GetMapping("/shop-address/{id}")
	@ResponseBody
	public ResponseEntity<?> getShopAddressById(@PathVariable(value = "id") long id) {
		ResponseEntity<?> response;

		response = new ResponseEntity<Address>(service.getShopAddress(id), HttpStatus.OK);

		return response;

	}

}
