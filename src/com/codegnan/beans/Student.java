package com.codegnan.beans;

public class Student {
	
		
	
	int id;
	String Name;
	String email;
	public Student() {
	super();
	// TODO Auto-generated constructor stub
}
	public Student(int id, String name, String email) {
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
	public static Student parseStudent(String csv) {
		String[] values=csv.split(",");
		int id=Integer.parseInt(values[0].trim());
		String Name=values[1].trim();
		String email=values[2].trim();
		Student student=new Student(id,Name,email);
		return student;
	}
	
	



}
