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

import com.letsstartcoding.springbootrestapi.dao.HistoryDAO;
import com.letsstartcoding.springbootrestapi.model.History;

@RestController
@RequestMapping("/History")
public class HistoryController {
	
	@Autowired
	HistoryDAO DAO;
	
	/* to save*/
	@PostMapping("/add")
	public History createEmployee(@Valid @RequestBody History emp) {
		return DAO.save(emp);
	}
	
	/*get all*/
	@GetMapping("/getall")
	public List<History> getAllEmployees(){
		return DAO.findAll();
	}
	

}
