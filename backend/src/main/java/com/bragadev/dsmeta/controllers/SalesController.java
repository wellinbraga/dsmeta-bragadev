package com.bragadev.dsmeta.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bragadev.dsmeta.entities.Sales;
import com.bragadev.dsmeta.services.SalesService;

@RestController
@RequestMapping( value = "/sales")
public class SalesController {
	
	@Autowired
	SalesService service;

	@GetMapping
	public Page<Sales> findSales(@RequestParam(value= "minDate", defaultValue = "")String minDate,
								 @RequestParam(value= "maxDate", defaultValue = "")String maxDate, Pageable  page){
		return service.findSales(minDate, maxDate, page);
	}
}
