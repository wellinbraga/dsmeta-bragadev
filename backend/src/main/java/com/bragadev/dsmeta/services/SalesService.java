package com.bragadev.dsmeta.services;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.bragadev.dsmeta.entities.Sales;
import com.bragadev.dsmeta.repositories.SalesRepository;

@Service
public class SalesService {
	
	@Autowired
	SalesRepository repository;
	
	public Page<Sales> findSales( String minDate, String maxDate,Pageable page){
		LocalDate min = LocalDate.parse(minDate);
		LocalDate max = LocalDate.parse(maxDate);
		
		return repository.findSales(min, max, page);
	}

}
