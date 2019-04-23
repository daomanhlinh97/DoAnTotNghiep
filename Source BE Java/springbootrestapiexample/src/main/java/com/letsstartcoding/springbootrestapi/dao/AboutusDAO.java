package com.letsstartcoding.springbootrestapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsstartcoding.springbootrestapi.model.Aboutus;
import com.letsstartcoding.springbootrestapi.repository.AboutusRepository;

@Service
public class AboutusDAO {
	
	@Autowired
	AboutusRepository RequestRepository;
	
	/*to save an employee*/
	
	public Aboutus save(Aboutus dri) {
		return RequestRepository.save(dri);
	}
	
	
	/* search all employees*/
	
	public List<Aboutus> findAll(){
		return RequestRepository.findAll();
	}
	
	
	/*get an employee by id*/
	public Aboutus findOne(Long id) {
		return RequestRepository.findOne(id);
	}
	
	
	/*delete an employee*/
	
	public void delete(Aboutus dri) {
		RequestRepository.delete(dri);
	}
	

}
