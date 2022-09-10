package com.bragadev.dsmeta.services;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.bragadev.dsmeta.entities.Sales;
import com.bragadev.dsmeta.repositories.SalesRepository;

@Service
public class SalesService {
	
	@Autowired
	SalesRepository repository;
	
	public Page<Sales> findSales( String minDate, String maxDate,Pageable page){
		
		LocalDate today = LocalDate.ofInstant(Instant.now(),ZoneId.systemDefault());
		
		LocalDate min = minDate.equals("") ? today.minusDays(365) : LocalDate.parse(maxDate);
		LocalDate max = maxDate.equals("") ? today : LocalDate.parse(maxDate);
		
		
		return repository.findSales(min, max, page);
	}

}
