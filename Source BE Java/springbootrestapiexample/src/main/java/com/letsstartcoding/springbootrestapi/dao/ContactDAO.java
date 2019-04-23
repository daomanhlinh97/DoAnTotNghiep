package com.letsstartcoding.springbootrestapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsstartcoding.springbootrestapi.model.Contact;
import com.letsstartcoding.springbootrestapi.repository.ContactRepository;

@Service
public class ContactDAO {
	
	@Autowired
	ContactRepository RequestRepository;
	
	/*to save an employee*/
	
	public Contact save(Contact dri) {
		return RequestRepository.save(dri);
	}
	
	
	/* search all employees*/
	
	public List<Contact> findAll(){
		return RequestRepository.findAll();
	}
	
	
	/*get an employee by id*/
	public Contact findOne(Long id) {
		return RequestRepository.findOne(id);
	}
	
	
	/*delete an employee*/
	
	public void delete(Contact dri) {
		RequestRepository.delete(dri);
	}
	

}
