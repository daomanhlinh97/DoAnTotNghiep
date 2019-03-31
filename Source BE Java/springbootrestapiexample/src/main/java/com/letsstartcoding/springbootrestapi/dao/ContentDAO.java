package com.letsstartcoding.springbootrestapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsstartcoding.springbootrestapi.model.Content;
import com.letsstartcoding.springbootrestapi.repository.ContentRepository;

@Service
public class ContentDAO {
	
	@Autowired
	ContentRepository RequestRepository;
	
	/*to save an employee*/
	
	public Content save(Content dri) {
		return RequestRepository.save(dri);
	}
	
	
	/* search all employees*/
	
	public List<Content> findAll(){
		return RequestRepository.findAll();
	}
	
	
	/*get an employee by id*/
	public Content findOne(Long id) {
		return RequestRepository.findOne(id);
	}
	
	
	/*delete an employee*/
	
	public void delete(Content dri) {
		RequestRepository.delete(dri);
	}
	

}
