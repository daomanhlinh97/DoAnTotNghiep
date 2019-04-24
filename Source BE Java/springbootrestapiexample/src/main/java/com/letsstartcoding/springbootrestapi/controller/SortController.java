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

import com.letsstartcoding.springbootrestapi.dao.SortDAO;
import com.letsstartcoding.springbootrestapi.model.ProductItem;
import com.letsstartcoding.springbootrestapi.model.Sort;
import com.letsstartcoding.springbootrestapi.model.CompositeKey;

@RestController
@RequestMapping("/Sort")
public class SortController {
	
	@Autowired
	SortDAO DAO;
	
	/* to save*/
	@PostMapping("/add")
	public Sort createEmployee(@Valid @RequestBody Sort emp) {
		return DAO.save(emp);
	}
	
	/*get all*/
	@GetMapping("/getall")
	public List<Sort> getAllEmployees(){
		return DAO.findAll();
	}
	
	/*get by id*/
	@GetMapping("/getid/{id}/{id2}/{id3}")
	public ResponseEntity<Sort> getProContentById(@PathVariable(value="id") Long id1,
															@PathVariable(value="id2") Long id2, 
															@PathVariable(value="id3") Long id3){

		CompositeKey id = new CompositeKey(id1, id2, id3);
		Sort sort = DAO.findOne(id);
		return ResponseEntity.ok().body(sort);
	}

}
