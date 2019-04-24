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

import com.letsstartcoding.springbootrestapi.dao.ProductItemDAO;
import com.letsstartcoding.springbootrestapi.model.ProductItem;
import com.letsstartcoding.springbootrestapi.repository.ProductItemRepository;

@RestController
@RequestMapping("/ProductItem")
public class ProductItemController {
	
	@Autowired
	ProductItemDAO DAO;
	
	/* to save*/
	@PostMapping("/add")
	public ProductItem createEmployee(@Valid @RequestBody ProductItem emp) {
		return DAO.save(emp);
	}
	
	/*get all*/
	@GetMapping("/getall")
	public List<ProductItem> getAllEmployees(){
		return DAO.findAll();
	}
	
	/*get by id*/
	@GetMapping("/getid/{id}")
	public ResponseEntity<ProductItem> getProContentById(@PathVariable(value="id") Long empid){
		
		ProductItem emp= DAO.findOne(empid);

		if(emp==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(emp);
		
	}
	
}
