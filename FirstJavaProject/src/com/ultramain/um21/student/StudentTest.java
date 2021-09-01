package com.ultramain.um21.student;

public class StudentTest {

	public static void main(String[] args) {
		Student myStudent = new Student();
		StudentAssist sAssist = new StudentAssist();
		
		myStudent = sAssist.getStudentDetails(myStudent);
		sAssist.printStudentDetails(myStudent);
		

	}

}
