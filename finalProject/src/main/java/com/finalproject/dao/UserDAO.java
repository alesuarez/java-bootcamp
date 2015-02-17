package com.finalproject.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.finalproject.model.User;



@Transactional
public interface UserDAO extends CrudRepository<User, Long> {

	List <User> findAll();
}