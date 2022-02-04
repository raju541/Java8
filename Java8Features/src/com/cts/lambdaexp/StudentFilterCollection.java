package com.cts.lambdaexp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentFilterCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list=new ArrayList<Student>();
		Student s1=new Student(2,"Raju",27);
		Student s2=new Student(3,"Hari",28);
		Student s3=new Student(1,"Ali",26);
		Student s4=new Student(4,"Chandu",29);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		List<Student> result = list.stream()
									.filter(line -> !"Raju".equals(line))
									.collect(Collectors.toList());
		result.forEach(student -> System.out.println(student.id+" "+student.name+" "+student.age));
		
		
		//Stream<Student> result1 = list.stream().filter(st -> st.age < 28);
		//result1.forEach(student -> System.out.println(student.id+" "+student.name+" "+student.age));
	}

}
