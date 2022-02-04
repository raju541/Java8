package com.cts.lambdaexp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class StudentComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list=new ArrayList<>();
		Student s1=new Student(2,"Raju",27);
		Student s2=new Student(3,"Hari",28);
		Student s3=new Student(1,"Ali",26);
		Student s4=new Student(4,"Chandu",29);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		System.out.println("Sorting with Name");
		Collections.sort(list,(st1,st2)->{
			return st1.name.compareTo(st2.name);
		});
		for (Student student : list) {
			System.out.println(student.id+" "+student.name+" "+student.age);
		}
	}
}
