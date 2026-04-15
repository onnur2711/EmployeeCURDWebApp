package com.emp.dto;

import java.util.Date;

public class EmployeeDto {


		private int id;
		private String name;
		private int salary;
		private String loc;
		private String dept;
		private int age;
		private Date DateOfJoin;
		
		//Constructor with all the fields
		
		public EmployeeDto(int id, String name, int salary, String loc,String dept,int age,Date DateOfJoin) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
			this.loc = loc;
			this.dept = dept;
			this.age = age;
			this.DateOfJoin=DateOfJoin;
		}
		
		//Getters and setters
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public String getLoc() {
			return loc;
		}
		public void setLoc(String loc) {
			this.loc = loc;
		}
		public String getDept() {
			return dept;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public Date getDateOfJoin() {
			return  DateOfJoin;
		}
		public void setDateOfJoin(Date dateOfJoin) {
			DateOfJoin = dateOfJoin;
		}
		
		//No args Constructor
		public EmployeeDto() {
			super();
		}

		
		



	}



