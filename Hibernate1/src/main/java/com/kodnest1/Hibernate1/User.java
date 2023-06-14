package com.kodnest1.Hibernate1;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User implements Serializable{
	
	@Id
	@Column(name="Accno")
	private String accno;
	@Column(name="name")
	private String name;
	@Column(name="amount")
	private String amount;
	@Column(name="password")
	private String password;
	@Column(name="email")
	private String email;
	@Column(name="phone")
	private String phone;
	
	
	
	public User(String accno, String name, String amount, String password, String email, String phone) {
		this.accno = accno;
		this.name = name;
		this.amount = amount;
		this.password = password;
		this.email = email;
		this.phone = phone;
	}
public User() {
	// TODO Auto-generated constructor stub
}

	public void setAccno(String accno) {
	this.accno = accno;
}
public void setName(String name) {
	this.name = name;
}
public void setAmount(String amount) {
	this.amount = amount;
}
public void setPassword(String password) {
	this.password = password;
}
public void setEmail(String email) {
	this.email = email;
}
public void setPhone(String phone) {
	this.phone = phone;
}
	public String getAccno() {
		return accno;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAmount() {
		return amount;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPhone() {
		return phone;
	}
	
	@Override
	public String toString() {
		return accno+" "+name+" "+amount+" "+password+" "+email+" "+phone;
		}
	
	
}

