package com.letsstartcoding.springbootrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.letsstartcoding.springbootrestapi.model.Member;


public interface MemberRepository extends JpaRepository<Member, Long> {

}