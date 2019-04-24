package com.letsstartcoding.springbootrestapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsstartcoding.springbootrestapi.model.User;
import com.letsstartcoding.springbootrestapi.repository.UserRepository;

@Service
public class UserDAO {
	
	@Autowired
	UserRepository ContentRepository;
	
	/*to save an employee*/
	
	public User save(User dri) {
		return ContentRepository.save(dri);
	}
	
	
	/* search all employees*/
	
	public List<User> findAll(){
		return ContentRepository.findAll();
	}
	
	
	/*get an employee by id*/
	public User findOne(Long id) {
		return ContentRepository.findOne(id);
	}
	
	
	/*delete an employee*/
	
	public void delete(User dri) {
		ContentRepository.delete(dri);
	}
	

}
