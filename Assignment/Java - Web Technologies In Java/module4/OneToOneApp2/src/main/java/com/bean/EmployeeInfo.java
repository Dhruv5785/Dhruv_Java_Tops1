package com.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name = "EmployeeInfo")
public class EmployeeInfo {
	private int epid;
	private String fname,lname,mobile,address;
	private Employee emp;
	
	@Id
	@GenericGenerator(name = "inc",strategy = "increment")
	@GeneratedValue(generator = "inc")
	public int getEpid() {
		return epid;
	}
	public void setEpid(int epid) {
		this.epid = epid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "epid")
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
	
}
