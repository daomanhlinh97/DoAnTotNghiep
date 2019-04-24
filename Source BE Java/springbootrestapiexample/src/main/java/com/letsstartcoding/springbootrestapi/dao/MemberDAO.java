package com.letsstartcoding.springbootrestapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsstartcoding.springbootrestapi.model.Member;
import com.letsstartcoding.springbootrestapi.repository.MemberRepository;

@Service
public class MemberDAO {
	
	@Autowired
	MemberRepository RequestRepository;
	
	/*to save an employee*/
	
	public Member save(Member dri) {
		return RequestRepository.save(dri);
	}
	
	
	/* search all employees*/
	
	public List<Member> findAll(){
		return RequestRepository.findAll();
	}
	
	
	/*get an employee by id*/
	public Member findOne(Long id) {
		return RequestRepository.findOne(id);
	}
	
	
	/*delete an employee*/
	
	public void delete(Member dri) {
		RequestRepository.delete(dri);
	}
	

}
