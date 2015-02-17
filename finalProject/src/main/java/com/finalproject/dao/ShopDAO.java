package com.finalproject.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.finalproject.model.Shop;



@Transactional
public interface ShopDAO extends CrudRepository<Shop, Long> {

	List <Shop> findAll();
}
