package com.finalproject.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.finalproject.model.Line;




@Transactional
public interface LineDAO extends CrudRepository<Line, Long> {

	List <Line> findAll();
}
