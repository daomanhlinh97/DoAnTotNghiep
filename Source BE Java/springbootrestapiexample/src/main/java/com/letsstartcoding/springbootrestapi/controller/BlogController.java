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

import com.letsstartcoding.springbootrestapi.dao.BlogDAO;
import com.letsstartcoding.springbootrestapi.model.Blog;

@RestController
@RequestMapping("/Blog")
public class BlogController {
	
	@Autowired
	BlogDAO DAO;
	
	/* to save*/
	@PostMapping("/add")
	public Blog createEmployee(@Valid @RequestBody Blog emp) {
		return DAO.save(emp);
	}
	
	/*get all*/
	@GetMapping("/getall")
	public List<Blog> getAllEmployees(){
		return DAO.findAll();
	}
	
	/*get by id*/
	@GetMapping("/getid/{id}")
	public ResponseEntity<Blog> getProContentById(@PathVariable(value="id") Long empid){
		
		Blog emp= DAO.findOne(empid);

		if(emp==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(emp);
		
	}

}
