package com.finalproject.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "pay")
public class Pay {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "idPay")
	int idPay;
	
	@NotNull
	@Column(name = "form")
	String form;
	
	

	@OneToMany(mappedBy="pay")
	private List<Shop> shopList;
	
	@OneToMany(mappedBy="pay")
	private List<Line> lineList;
	
	public Pay(){}
	public int getIdPay() {
		return idPay;
	}
	public void setIdPay(int idPay) {
		this.idPay = idPay;
	}
	public String getForm() {
		return form;
	}
	public void setForm(String form) {
		this.form = form;
	}
	
}
