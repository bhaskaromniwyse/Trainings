package com.assignment5;

public class Employee {
	private int empID;
	private String empName;
	private double sal;
	private String job;
	private String dept;
	
	public Employee(){}
	public Employee(int id,String name,double sal,String job,String dept){
		this.empID = id;
		this.empName = name;
		this.sal  = sal;
		this.job = job;
		this.dept = dept;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}

}
