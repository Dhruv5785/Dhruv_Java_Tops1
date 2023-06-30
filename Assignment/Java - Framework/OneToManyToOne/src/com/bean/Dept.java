package com.bean;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Department")
public class Dept {
	
	private int did;
	private String dname,loc;
	private Collection<Emp> emp;
	
	
	@Id
	@GenericGenerator(name="inc",strategy="increment")
	@GeneratedValue(generator = "inc")
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	
	@Column(name="Dept_Name")
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	
	@Column(name="Location")
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy="dept")
	public Collection<Emp> getEmp() {
		return emp;
	}
	public void setEmp(Collection<Emp> emp) {
		this.emp = emp;
	}
	
	
	
	
	

}
