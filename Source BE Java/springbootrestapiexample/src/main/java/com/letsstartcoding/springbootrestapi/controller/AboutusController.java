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

import com.letsstartcoding.springbootrestapi.dao.AboutusDAO;
import com.letsstartcoding.springbootrestapi.model.Aboutus;

@RestController
@RequestMapping("/Aboutus")
public class AboutusController {
	
	@Autowired
	AboutusDAO DAO;
	
	/* to save*/
	@PostMapping("/add")
	public Aboutus createEmployee(@Valid @RequestBody Aboutus emp) {
		return DAO.save(emp);
	}
	
	/*get all*/
	@GetMapping("/getall")
	public List<Aboutus> getAllEmployees(){
		return DAO.findAll();
	}
	
	/*get by id*/
	@GetMapping("/getid/{id}")
	public ResponseEntity<Aboutus> getProContentById(@PathVariable(value="id") Long empid){
		
		Aboutus emp= DAO.findOne(empid);

		if(emp==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(emp);
		
	}
	
	/*get by id*/
	@GetMapping("/getname/{id}")
	public ResponseEntity<Aboutus> getProContentByName(@PathVariable(value="id") String empid){
		
		List<Aboutus> emp= DAO.findAll();
		for(int i=0;i<emp.size();i++) {
			if(emp.get(i).getPageTitle().equals(empid)) {
				return ResponseEntity.ok().body(emp.get(i));		
			}
		}
		return ResponseEntity.notFound().build();
	}
}
