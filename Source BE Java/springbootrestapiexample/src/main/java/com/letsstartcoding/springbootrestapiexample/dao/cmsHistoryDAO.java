package com.letsstartcoding.springbootrestapiexample.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsstartcoding.springbootrestapiexample.model.cmsHistory;
import com.letsstartcoding.springbootrestapiexample.repository.cmsHistoryRep;

@Service
public class cmsHistoryDAO {
	
	@Autowired
	cmsHistoryRep cmsHistoryRep;
	
	/*to save an employee*/
	
	public cmsHistory save(cmsHistory emp) {
		return cmsHistoryRep.save(emp);
	}
	
	
	/* search all employees*/
	
	public List<cmsHistory> findAll(){
		return cmsHistoryRep.findAll();
	}
	
	
	/*get an employee by id*/
	public cmsHistory findOne(Long empid) {
		return cmsHistoryRep.findOne(empid);
	}
	
	
	/*delete an employee*/
	
	public void delete(cmsHistory emp) {
		cmsHistoryRep.delete(emp);
	}
	

}
