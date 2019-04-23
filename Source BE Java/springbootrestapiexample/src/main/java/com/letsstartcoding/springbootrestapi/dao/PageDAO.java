package com.letsstartcoding.springbootrestapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsstartcoding.springbootrestapi.model.Page;
import com.letsstartcoding.springbootrestapi.repository.PageRepository;

@Service
public class PageDAO {
	
	@Autowired
	PageRepository RequestRepository;
	
	/*to save an employee*/
	
	public Page save(Page dri) {
		return RequestRepository.save(dri);
	}
	
	
	/* search all employees*/
	
	public List<Page> findAll(){
		return RequestRepository.findAll();
	}
	
	
	/*get an employee by id*/
	public Page findOne(Long id) {
		return RequestRepository.findOne(id);
	}
	
	
	/*delete an employee*/
	
	public void delete(Page dri) {
		RequestRepository.delete(dri);
	}
	

}
