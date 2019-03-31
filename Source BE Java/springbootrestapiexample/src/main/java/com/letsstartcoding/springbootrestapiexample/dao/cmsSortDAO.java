//package com.letsstartcoding.springbootrestapiexample.dao;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.letsstartcoding.springbootrestapiexample.model.cmsHistory;
//import com.letsstartcoding.springbootrestapiexample.repository.cmsSortRep;
//
//@Service
//public class cmsSortDAO {
//	
//	@Autowired
//	cmsSortRep cmsSortRep;
//	
//	/*to save an employee*/
//	
//	public cmsHistory save(cmsHistory dri) {
//		return cmsSortRep.save(dri);
//	}
//	
//	
//	/* search all employees*/
//	
//	public List<cmsHistory> findAll(){
//		return cmsSortRep.findAll();
//	}
//	
//	
//	/*get an employee by id*/
//	public cmsHistory findOne(Long id) {
//		return cmsSortRep.findOne(id);
//	}
//	
//	
//	/*delete an employee*/
//	
//	public void delete(cmsHistory dri) {
//		cmsSortRep.delete(dri);
//	}
//	
//
//}
