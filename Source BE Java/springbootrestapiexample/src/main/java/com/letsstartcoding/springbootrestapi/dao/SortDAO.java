package com.letsstartcoding.springbootrestapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsstartcoding.springbootrestapi.model.Sort;
import com.letsstartcoding.springbootrestapi.repository.SortRepository;

@Service
public class SortDAO {
	
	@Autowired
	SortRepository RequestRepository;
	
	/*to save an employee*/
	
	public Sort save(Sort dri) {
		return RequestRepository.save(dri);
	}
	
	
	/* search all employees*/
	
	public List<Sort> findAll(){
		return RequestRepository.findAll();
	}
	
	
	/*get an employee by id*/
	public Sort findOne(Long id) {
		return RequestRepository.findOne(id);
	}
	
	
	/*delete an employee*/
	
	public void delete(Sort dri) {
		RequestRepository.delete(dri);
	}
	

}
