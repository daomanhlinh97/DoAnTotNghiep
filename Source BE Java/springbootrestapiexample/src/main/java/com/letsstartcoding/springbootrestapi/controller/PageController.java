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

import com.letsstartcoding.springbootrestapi.dao.PageDAO;
import com.letsstartcoding.springbootrestapi.model.Page;
import com.letsstartcoding.springbootrestapi.model.ProductContent;

@RestController
@RequestMapping("/Page")
public class PageController {
	
	@Autowired
	PageDAO DAO;
	
	/* to save*/
	@PostMapping("/add")
	public Page createEmployee(@Valid @RequestBody Page emp) {
		return DAO.save(emp);
	}
	
	/*get all*/
	@GetMapping("/getall")
	public List<Page> getAllEmployees(){
		return DAO.findAll();
	}
	
	/*get by id*/
	@GetMapping("/getid/{id}")
	public ResponseEntity<Page> getProContentById(@PathVariable(value="id") Long empid){
		
		Page emp= DAO.findOne(empid);

		if(emp==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(emp);
		
	}
//	
//	
//	/*update an employee by empid*/
//	@PutMapping("/employees/{id}")
//	public ResponseEntity<cmsSort> updateEmployee(@PathVariable(value="id") Long empid,@Valid @RequestBody cmsSort empDetails){
//		
//		cmsSort emp=employeeDAO.findOne(empid);
//		if(emp==null) {
//			return ResponseEntity.notFound().build();
//		}
//		
//		emp.setName(empDetails.getName());
//		emp.setDesignation(empDetails.getDesignation());
//		emp.setExpertise(empDetails.getExpertise());
//		
//		cmsSort updateEmployee=employeeDAO.save(emp);
//		return ResponseEntity.ok().body(updateEmployee);
//		
//		
//		
//	}
//	
//	/*Delete an employee*/
//	@DeleteMapping("/employees/{id}")
//	public ResponseEntity<cmsSort> deleteEmployee(@PathVariable(value="id") Long empid){
//		
//		cmsSort emp=employeeDAO.findOne(empid);
//		if(emp==null) {
//			return ResponseEntity.notFound().build();
//		}
//		employeeDAO.delete(emp);
//		
//		return ResponseEntity.ok().build();
//		
//		
//	}
//	
//	

}
