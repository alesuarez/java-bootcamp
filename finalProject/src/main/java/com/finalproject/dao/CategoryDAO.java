package com.finalproject.dao;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.finalproject.model.Category;



@Transactional
public interface CategoryDAO extends CrudRepository<Category, Long> {

	List <Category> findAll(); 
	
}