package com.letsstartcoding.springbootrestapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsstartcoding.springbootrestapi.model.CompositeKey;
import com.letsstartcoding.springbootrestapi.model.Sort;
import com.letsstartcoding.springbootrestapi.repository.SortRepository;

@Service
public class SortDAO {
	
	@Autowired
	SortRepository RequestRepository;
	
	/*to save*/
	
	public Sort save(Sort dri) {
		return RequestRepository.save(dri);
	}
	
	
	/* Get list all*/
	
	public List<Sort> findAll(){
		return RequestRepository.findAll();
	}
	
	
	/*get by id*/
	public Sort findOne(CompositeKey id) {
	
		List<Sort> listS = RequestRepository.findAll();
		for(int i=0;i<listS.size();i++) {
			if(listS.get(i).getAllowedId()== id.getAllowedId() && 
				listS.get(i).getChildId()== id.getChildId() &&
				listS.get(i).getParentId()== id.getParentId()) {
				return listS.get(i);
			}
		}
		
		return null;
	}
	
	
	/*delete*/
	
	public void delete(Sort dri) {
		RequestRepository.delete(dri);
	}
	

}
