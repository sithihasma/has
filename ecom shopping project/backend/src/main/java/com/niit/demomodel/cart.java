package com.niit.demomodel;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Entity	
@Component
@Table(name="CART")
public class cart implements Serializable
{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="CART_ID")
	private int cartid;

	@Column(name="PRODUCT_ID")
	private int productid;
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	@Column(name="QUANTITY")
	private int quantity;
	@Column(name="PRICE")
	private double price;
	@Column(name="STATUS")
	private String status;
	public int getCartid() {
		return cartid;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}

