package com.letsstartcoding.springbootrestapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsstartcoding.springbootrestapi.model.History;
import com.letsstartcoding.springbootrestapi.repository.HistoryRepository;

@Service
public class HistoryDAO {
	
	@Autowired
	HistoryRepository RequestRepository;
	
	/*to save an employee*/
	
	public History save(History dri) {
		return RequestRepository.save(dri);
	}
	
	
	/* search all employees*/
	
	public List<History> findAll(){
		return RequestRepository.findAll();
	}
	
	
	/*get an employee by id*/
	public History findOne(Long id) {
		return RequestRepository.findOne(id);
	}
	
	
	/*delete an employee*/
	
	public void delete(History dri) {
		RequestRepository.delete(dri);
	}
	

}
