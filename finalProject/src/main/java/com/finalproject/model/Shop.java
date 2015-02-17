package com.finalproject.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;



@Entity
@Table(name="shop")
public class Shop {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "idShop")
	int idShop;
	
	@NotNull
	@Column(name = "hourDay")
	String hourDay;
	
	@NotNull
	@Column(name = "state")
	char state;
	
	@ManyToOne
	@JoinColumn(name="idPay")
	private Pay pay;
	
	@ManyToOne
	@JoinColumn(name="idUser")
	private User user;
	
	@OneToMany(mappedBy="shop")
	private List<Line> lineList;
	
	public Shop(){}
	public int getIdShop() {
		return idShop;
	}
	public void setIdShop(int idShop) {
		this.idShop = idShop;
	}
	public String getHourDay() {
		return hourDay;
	}
	public void setHourDay(String hourDay) {
		this.hourDay = hourDay;
	}
	public char getState() {
		return state;
	}
	public void setState(char state) {
		this.state = state;
	}
}
