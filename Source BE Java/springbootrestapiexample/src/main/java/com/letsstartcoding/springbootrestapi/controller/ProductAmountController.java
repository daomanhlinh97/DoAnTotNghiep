package com.letsstartcoding.springbootrestapi.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.letsstartcoding.springbootrestapi.dao.ProductAmountDAO;
import com.letsstartcoding.springbootrestapi.model.ProductAmount;

@RestController
@RequestMapping("/ProductAmount")
public class ProductAmountController {
	
	@Autowired
	ProductAmountDAO DAO;
	
	/* to save*/
	@PostMapping("/add")
	public ProductAmount createEmployee(@Valid @RequestBody ProductAmount emp) {
		return DAO.save(emp);
	}
	
	/*get all*/
	@GetMapping("/getall")
	public List<ProductAmount> getAllEmployees(){
		return DAO.findAll();
	}
	
}
