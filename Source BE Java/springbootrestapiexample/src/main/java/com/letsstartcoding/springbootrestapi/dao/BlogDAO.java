package com.letsstartcoding.springbootrestapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsstartcoding.springbootrestapi.model.Blog;
import com.letsstartcoding.springbootrestapi.repository.BlogRepository;

@Service
public class BlogDAO {
	
	@Autowired
	BlogRepository RequestRepository;
	
	/*to save an employee*/
	
	public Blog save(Blog dri) {
		return RequestRepository.save(dri);
	}
	
	
	/* search all employees*/
	
	public List<Blog> findAll(){
		return RequestRepository.findAll();
	}
	
	
	/*get an employee by id*/
	public Blog findOne(Long id) {
		return RequestRepository.findOne(id);
	}
	
	
	/*delete an employee*/
	
	public void delete(Blog dri) {
		RequestRepository.delete(dri);
	}
	

}
