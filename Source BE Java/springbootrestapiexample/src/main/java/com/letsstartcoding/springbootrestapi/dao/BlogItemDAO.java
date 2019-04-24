package com.letsstartcoding.springbootrestapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsstartcoding.springbootrestapi.model.BlogItem;
import com.letsstartcoding.springbootrestapi.repository.BlogItemRepository;

@Service
public class BlogItemDAO {
	
	@Autowired
	BlogItemRepository RequestRepository;
	
	/*to save an employee*/
	
	public BlogItem save(BlogItem dri) {
		return RequestRepository.save(dri);
	}
	
	
	/* search all employees*/
	
	public List<BlogItem> findAll(){
		return RequestRepository.findAll();
	}
	
	
	/*get an employee by id*/
	public BlogItem findOne(Long id) {
		return RequestRepository.findOne(id);
	}
	
	
	/*delete an employee*/
	
	public void delete(BlogItem dri) {
		RequestRepository.delete(dri);
	}
	

}
