package com.ultramain.um21.student;

import java.util.Scanner;

public class StudentAssist {
	public Student getStudentDetails(Student student){
		Student myStudent=null;
		if(student== null){
			myStudent= new Student();
		}
		else{
			myStudent = student;
		}
		Scanner scan =new Scanner(System.in);  
		System.out.println("Enter Student Id: ");
		myStudent.setStudentID(scan.nextInt());
		System.out.println("Enter Student Name:");
		myStudent.setStudentName(scan.next());
		System.out.println("Enter Department:");
		myStudent.setDept(scan.next());
		return myStudent;
		
	}
	
	public void printStudentDetails(Student student){
		if(student !=null){
			System.out.println("Student ID;" +student.getStudentID());
			System.out.println("Student Name;" +student.getStudentName());
			System.out.println("Department;" +student.getDept());
		}
		
	}

}
