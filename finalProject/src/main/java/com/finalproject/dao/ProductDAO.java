package com.finalproject.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.finalproject.model.Product;



@Transactional
public interface ProductDAO extends CrudRepository<Product, Long> {

	List <Product> findAll();
}