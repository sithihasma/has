package com.niit.demomodel;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SUPPLIER")
public class supplier implements Serializable
{
	private static final long serialVersionUID = 1L;
@Id
@Column(name="S_ID")
private int sid;
@Column(name="S_NAME")
private int sname;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public int getSname() {
	return sname;
}
public void setSname(int sname) {
	this.sname = sname;
}
}
