package com.niit.demomodel;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ORDERS")

public class orders implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ODR_ID")
	private int odrid;
	@Column(name="ODR_NAME")
	private int odrname;
	@Column(name="USER")
	private int user;
	@Column(name="PAYMENTS")
	private int payments;
	@Column(name="TOTAL")
	private int total;
	@Column(name="DELIVERY_ADDRESS")
	private int deli_address;
	@Column(name="NO_OF_ODR")
	private int no_of_odrs;
	public int getOdrid() {
		return odrid;
	}
	public void setOdrid(int odrid) {
		this.odrid = odrid;
	}
	public int getOdrname() {
		return odrname;
	}
	public void setOdrname(int odrname) {
		this.odrname = odrname;
	}
	public int getUser() {
		return user;
	}
	public void setUser(int user) {
		this.user = user;
	}
	public int getPayments() {
		return payments;
	}
	public void setPayments(int payments) {
		this.payments = payments;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getDeli_address() {
		return deli_address;
	}
	public void setDeli_address(int deli_address) {
		this.deli_address = deli_address;
	}
	public int getNo_of_odrs() {
		return no_of_odrs;
	}
	public void setNo_of_odrs(int no_of_odrs) {
		this.no_of_odrs = no_of_odrs;
	}

}


