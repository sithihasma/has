package com.niit.demomodel;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Component
@Table(name="PRODUCT")


public class product implements Serializable {
private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="PRODUCT_ID")
	private int productid;
	@Column(name="PRODUCT_NAME")
	private int  productname;
	@Column(name="BRAND_NAME")
	private int brandname;
	@Column(name="description")
	private int p_description;
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getProductname() {
		return productname;
	}
	@Transient
	private MultipartFile file;
	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int cat_id;

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int s_id;
	
	
	public void setProductname(int productname) {
		this.productname = productname;
	}
	public int getBrandname() {
		return brandname;
	}
	public void setBrandname(int brandname) {
		this.brandname = brandname;
	}
	public int getP_description() {
		return p_description;
	}
	public void setP_description(int p_description) {
		this.p_description = p_description;
	}
	
	

}


