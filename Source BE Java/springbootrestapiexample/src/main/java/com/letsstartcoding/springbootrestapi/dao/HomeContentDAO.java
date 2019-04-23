package com.letsstartcoding.springbootrestapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsstartcoding.springbootrestapi.model.HomeContent;
import com.letsstartcoding.springbootrestapi.repository.HomeContentRepository;

@Service
public class HomeContentDAO {
	
	@Autowired
	HomeContentRepository ContentRepository;
	
	/*to save an employee*/
	
	public HomeContent save(HomeContent dri) {
		return ContentRepository.save(dri);
	}
	
	
	/* search all employees*/
	
	public List<HomeContent> findAll(){
		return ContentRepository.findAll();
	}
	
	
	/*get an employee by id*/
	public HomeContent findOne(Long id) {
		return ContentRepository.findOne(id);
	}
	
	
	/*delete an employee*/
	
	public void delete(HomeContent dri) {
		ContentRepository.delete(dri);
	}
	

}
