package com.letsstartcoding.springbootrestapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsstartcoding.springbootrestapi.model.ProductItem;
import com.letsstartcoding.springbootrestapi.repository.ProductItemRepository;

@Service
public class ProductItemDAO {
	
	@Autowired
	ProductItemRepository ContentRepository;
	
	/*to save an employee*/
	
	public ProductItem save(ProductItem dri) {
		return ContentRepository.save(dri);
	}
	
	
	/* search all employees*/
	
	public List<ProductItem> findAll(){
		return ContentRepository.findAll();
	}
	
	
	/*get an employee by id*/
	public ProductItem findOne(Long id) {
		return ContentRepository.findOne(id);
	}
	
	
	/*delete an employee*/
	
	public void delete(ProductItem dri) {
		ContentRepository.delete(dri);
	}
	

}
