package com.finalproject.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.finalproject.model.Pay;




@Transactional
public interface PayDAO extends CrudRepository<Pay, Long> {

	List <Pay> findAll();
}