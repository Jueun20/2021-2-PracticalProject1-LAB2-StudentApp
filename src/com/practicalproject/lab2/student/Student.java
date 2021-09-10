package com.practicalproject.lab2.student;

public class Student implements Comparable<Student>{
	int no;
	String name;
	int age;
	
	public Student (int num, String nm, int ag){
		this.no = num;
		this.name = nm;
		this.age = ag;
	}
	
	public int compareTo(Student s) {
		return name.compareTo(s.name);
	}
	
	public String toString(){
		return "Student [no = " + no + ", name = " + name + ", age = " + age + "]";
	}
}
