package com.letsstartcoding.springbootrestapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsstartcoding.springbootrestapi.model.ProductAmount;
import com.letsstartcoding.springbootrestapi.repository.ProductAmountRepository;

@Service
public class ProductAmountDAO {
	
	@Autowired
	ProductAmountRepository ContentRepository;
	
	/*to save an employee*/
	
	public ProductAmount save(ProductAmount dri) {
		return ContentRepository.save(dri);
	}
	
	
	/* search all employees*/
	
	public List<ProductAmount> findAll(){
		return ContentRepository.findAll();
	}
	
	
	/*get an employee by id*/
	public ProductAmount findOne(Long id) {
		return ContentRepository.findOne(id);
	}
	
	
	/*delete an employee*/
	
	public void delete(ProductAmount dri) {
		ContentRepository.delete(dri);
	}
	

}
