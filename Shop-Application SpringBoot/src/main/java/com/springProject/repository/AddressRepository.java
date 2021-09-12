package com.springProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springProject.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

	@Query(value = "SELECT a FROM Address a WHERE a.id=:id")
	public Address getShopAddressById(@Param(value = "id") long id);

}
