package com.letsstartcoding.springbootrestapiexample.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsstartcoding.springbootrestapiexample.model.cmsContentType;
import com.letsstartcoding.springbootrestapiexample.repository.cmsContentTypeRep;

@Service
public class cmsContentTypeDAO {
	
	@Autowired
	cmsContentTypeRep cmsContentType;
	
	/*to save an employee*/
	
	public cmsContentType save(cmsContentType dri) {
		return cmsContentType.save(dri);
	}
	
	
	/* search all employees*/
	
	public List<cmsContentType> findAll(){
		return cmsContentType.findAll();
	}
	
	
	/*get an employee by id*/
	public cmsContentType findOne(Long id) {
		return cmsContentType.findOne(id);
	}
	
	
	/*delete an employee*/
	
	public void delete(cmsContentType dri) {
		cmsContentType.delete(dri);
	}
	

}
