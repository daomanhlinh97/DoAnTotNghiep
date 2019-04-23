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

import com.letsstartcoding.springbootrestapi.dao.ProductContentDAO;
import com.letsstartcoding.springbootrestapi.model.Page;
import com.letsstartcoding.springbootrestapi.model.ProductContent;
import com.letsstartcoding.springbootrestapi.repository.ProductContentRepository;

@RestController
@RequestMapping("/ProductContent")
public class ProductContentController {
	
	@Autowired
	ProductContentDAO DAO;
	ProductContentRepository a;
	
	/* to save*/
	@PostMapping("/add")
	public ProductContent createEmployee(@Valid @RequestBody ProductContent emp) {
		return DAO.save(emp);
	}
	
	/*get all*/
	@GetMapping("/getall")
	public List<ProductContent> getAllEmployees(){
		return DAO.findAll();
	}
	
	/*get by id*/
	@GetMapping("/getid/{id}")
	public ResponseEntity<ProductContent> getProContentById(@PathVariable(value="id") Long empid){
		
		ProductContent emp= DAO.findOne(empid);

		if(emp==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(emp);
		
	}
	
}
