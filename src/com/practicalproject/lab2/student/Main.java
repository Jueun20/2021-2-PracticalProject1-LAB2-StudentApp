package com.practicalproject.lab2.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String args[]){
		List<Student> arryList = new ArrayList<Student>();
		System.out.println("Student List (ordered by name)");
		Student s1 = new Student(101, "Kim", 23);
		arryList.add(s1);
		Student s2 = new Student(102, "Choi", 20);
		arryList.add(s2);
		Student s3 = new Student(103, "Seo", 22);
		arryList.add(s3);
		Student s4 = new Student(104, "Kook", 24);
		arryList.add(s4);
		Student s5 = new Student(105, "Lee", 24);
		arryList.add(s5);
		Student s6 = new Student(106, "Jeong", 28);
		arryList.add(s6);
		Student s7 = new Student(107, "Cho", 27);
		arryList.add(s7);
		Student s8 = new Student(108, "Hwang", 29);
		arryList.add(s8);
		Student s9 = new Student(109, "Kang", 21);
		arryList.add(s9);
		arryList.add(new Student(110, "Park", 25));
		
		Collections.sort(arryList);
		for (Student s : arryList) {
			System.out.println(s.toString());
		}
		System.out.println("Student List (reverse ordered by name)");
		
		Collections.sort(arryList, Collections.reverseOrder());
		for (int i = 0; i < arryList.size(); i ++){
			System.out.println(arryList.get(i).toString());
		}
	}
}
