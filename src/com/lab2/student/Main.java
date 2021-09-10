package com.lab2.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String args[]){
		List<Student> arryList = new ArrayList<Student>();
		System.out.println("Student List (ordered by name)");
		Student s1 = new Student(101, "Kim", 23);
		arryList.add(s1);
		Student s2 = new Student(102, "Choi", 21);
		arryList.add(s2);
		arryList.add(new Student(103, "Park", 25));
		
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
