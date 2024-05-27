package com.codegnan.beans;

import java.io.Serializable;

public class Employee implements Serializable{
	int id;
	String Name;
	String email;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
		public Employee(int id, String name, String email) {
			super();
			this.id = id;
			Name = name;
			this.email = email;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", Name=" + Name + ", email=" + email + "]";
		}
		
		public String toCSV() {
			return id+" ,"+Name+" ,"+email;
		}
		
		

	

}
