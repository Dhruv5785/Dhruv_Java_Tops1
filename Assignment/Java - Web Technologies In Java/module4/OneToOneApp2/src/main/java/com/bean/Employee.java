package com.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name = "Employee")
public class Employee {
	
	private int eid;
   private String uname,password;
   private EmployeeInfo epid;
   
   @Id
   @GenericGenerator(name = "inc",strategy = "increment")
	@GeneratedValue(generator = "inc")
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@OneToOne(fetch =FetchType.EAGER,cascade = CascadeType.ALL)
@JoinColumn(name = "EPID")
public EmployeeInfo getEpid() {
	return epid;
}
public void setEpid(EmployeeInfo epid) {
	this.epid = epid;
}
   
   

}
