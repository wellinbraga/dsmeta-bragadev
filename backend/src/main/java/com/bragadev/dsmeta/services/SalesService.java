package com.bragadev.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bragadev.dsmeta.entities.Sales;
import com.bragadev.dsmeta.repositories.SalesRepository;

@Service
public class SalesService {
	
	@Autowired
	SalesRepository repository;
	
	public List<Sales> findAll(){
		return repository.findAll();
	}

}
