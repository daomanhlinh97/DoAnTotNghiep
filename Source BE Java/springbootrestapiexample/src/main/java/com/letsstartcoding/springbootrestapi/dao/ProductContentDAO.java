package com.letsstartcoding.springbootrestapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsstartcoding.springbootrestapi.model.ProductContent;
import com.letsstartcoding.springbootrestapi.repository.ProductContentRepository;

@Service
public class ProductContentDAO {
	
	@Autowired
	ProductContentRepository ContentRepository;
	
	/*to save an employee*/
	
	public ProductContent save(ProductContent dri) {
		return ContentRepository.save(dri);
	}
	
	
	/* search all employees*/
	
	public List<ProductContent> findAll(){
		return ContentRepository.findAll();
	}
	
	
	/*get an employee by id*/
	public ProductContent findOne(Long id) {
		return ContentRepository.findOne(id);
	}
	
	
	/*delete an employee*/
	
	public void delete(ProductContent dri) {
		ContentRepository.delete(dri);
	}
	

}
