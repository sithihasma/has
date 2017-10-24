package com.niit.demomodel;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="USER")

public class user implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
    @Column(name="U_MAIL")
	 private String u_mail;
	@Column(name="U_ID")
	 private int  u_id;
	@Column(name="U_NAME")
    private String u_name;
	@Column(name="U_AGE")
	private int age;
	@Column (name="U_PHONENO")
	private String phone;
	@Column (name="U_ADDRESS")
	private String address;
	@Column(name="U_PASSWORD")
     private String u_password;
	public String getU_mail() {
		return u_mail;
	}
	public void setU_mail(String u_mail) {
		this.u_mail = u_mail;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getU_password() {
		return u_password;
	}
	public void setU_password(String u_password) {
		this.u_password = u_password;
	}
}

