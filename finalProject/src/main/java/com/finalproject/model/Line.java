package com.finalproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "line")
public class Line {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "idLine")
	int idLine;
	
	@ManyToOne
	@JoinColumn(name="idPay")
	private Pay pay;
	
	@ManyToOne
	@JoinColumn(name="idUser")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="idShop")
	private Shop shop;
	
	@ManyToOne
	@JoinColumn(name="idProduct")
	private Product product;
	
	@ManyToOne
	@JoinColumn(name="idCategory")
	private Category category;
	
	
}
