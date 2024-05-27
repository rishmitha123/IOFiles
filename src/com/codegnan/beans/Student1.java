package com.codegnan.beans;

public class Student1 {
	
	
	
	int id;
	String name;
	String email;
	double marks1;
	double marks2;
	double marks3;
	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student1(int id, String name, String email, double marks1, double marks2, double marks3) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getMarks1() {
		return marks1;
	}
	public void setMarks1(double marks1) {
		this.marks1 = marks1;
	}
	public double getMarks2() {
		return marks2;
	}
	public void setMarks2(double marks2) {
		this.marks2 = marks2;
	}
	public double getMarks3() {
		return marks3;
	}
	public void setMarks3(double marks3) {
		this.marks3 = marks3;
	}
	public double getTotal() {
		return marks1+marks2+marks3;
	}
	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", email=" + email + ", marks1=" + marks1 + ", marks2="
				+ marks2 + ", marks3=" + marks3 + "]";
		}
	public String toCSV() {
		return id+" ,"+name+" ,"+email+" ,"+marks1+" ,"+marks2+" ,"+marks3;
	}
	
	public static Student1 parseStudent(String csv) {
		String[] values=csv.split(",");
		int id=Integer.parseInt(values[0].trim());
		String Name=values[1].trim();
		String email=values[2].trim();
		double marks1=Double.parseDouble(values[3].trim());
		double marks2=Double.parseDouble(values[4].trim());
		double marks3=Double.parseDouble(values[5].trim());
		
		Student1 student=new Student1(id,Name,email,marks1,marks2,marks3);
		return student;
	}
}


