package com.springProject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springProject.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	@Query(value = "SELECT e FROM Employee e")
	public List<Employee> getAllEmployees();

	@Query(value = "SELECT e FROM Employee e WHERE e.id=:id")
	public Employee getEmployeeById(@Param(value = "id") long id);
	

}
