package com.letsstartcoding.springbootrestapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsstartcoding.springbootrestapi.model.BlogContent;
import com.letsstartcoding.springbootrestapi.repository.BlogContentRepository;

@Service
public class BlogContentDAO {
	
	@Autowired
	BlogContentRepository RequestRepository;
	
	/*to save an employee*/
	
	public BlogContent save(BlogContent dri) {
		return RequestRepository.save(dri);
	}
	
	
	/* search all employees*/
	
	public List<BlogContent> findAll(){
		return RequestRepository.findAll();
	}
	
	
	/*get an employee by id*/
	public BlogContent findOne(Long id) {
		return RequestRepository.findOne(id);
	}
	
	
	/*delete an employee*/
	
	public void delete(BlogContent dri) {
		RequestRepository.delete(dri);
	}
	

}
