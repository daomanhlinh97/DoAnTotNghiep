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

import com.letsstartcoding.springbootrestapi.dao.HomeContentDAO;
import com.letsstartcoding.springbootrestapi.model.HomeContent;
import com.letsstartcoding.springbootrestapi.model.Page;

@RestController
@RequestMapping("/HomeContent")
public class HomeContentController {
	
	@Autowired
	HomeContentDAO DAO;
	
	/* to save*/
	@PostMapping("/add")
	public HomeContent createEmployee(@Valid @RequestBody HomeContent emp) {
		return DAO.save(emp);
	}
	
	/*get all*/
	@GetMapping("/getall")
	public List<HomeContent> getAllEmployees(){
		return DAO.findAll();
	}
	
	/*get by id*/
	@GetMapping("/getid/{id}")
	public ResponseEntity<HomeContent> getProContentById(@PathVariable(value="id") Long empid){
		
		HomeContent emp= DAO.findOne(empid);

		if(emp==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(emp);
		
	}
}
