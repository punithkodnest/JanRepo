package com.kodnest.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User {
	
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
	
	
	
	
}
