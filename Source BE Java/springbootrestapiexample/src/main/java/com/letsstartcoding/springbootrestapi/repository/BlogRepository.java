package com.letsstartcoding.springbootrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.letsstartcoding.springbootrestapi.model.Blog;


public interface BlogRepository extends JpaRepository<Blog, Long> {

}