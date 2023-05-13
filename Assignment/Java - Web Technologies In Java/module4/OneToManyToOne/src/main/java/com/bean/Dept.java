package com.bean;

import java.util.Collection;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="DEPT")
public class Dept {
   private int eid;
   private String dname,location,job;
   private Collection<Emp> emp;
 
 @Id
 @GenericGenerator(name = "inc",strategy = "increment")
 @GeneratedValue(generator = "inc")
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getJob() {
	return job;
}
public void setJob(String job) {
	this.job = job;
}
@OneToMany(fetch = FetchType.LAZY,mappedBy = "dept")
public Collection<Emp> getEmp() {
	return emp;
}
public void setEmp(Collection<Emp> emp) {
	this.emp = emp;
}
   
   
}
