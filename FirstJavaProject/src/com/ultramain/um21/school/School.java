package com.ultramain.um21.school;

public class School {
	public static void main(String args[]){
		BioMaths myBioMaths = new BioMaths();
		ComputerScience myComputerScience = new ComputerScience();
		myBioMaths.getGroupDetails();
		System.out.println("---------------------------");
		myComputerScience.getGroupDetails();
		
	}

}

class HigherSecondary{
	public void greeting(){
		System.out.println("Welcome to Higher Secondary");
		System.out.println("Here you have two Groups, Bio-Maths And Computer Science");
	}
}

class BioMaths extends HigherSecondary{
	public void intro(){
		System.out.println("Welcome to Bio Maths Group");
	}
	public void getGroupDetails(){
		greeting();
		intro();
		getSubjects();
	}
	public void getSubjects(){
		 new Subjects().subjectsList("Bio-Maths");
	}
}

class ComputerScience extends HigherSecondary{
	public void intro(){
		System.out.println("Welcome to Compuyer Science group");
	}
	public void getGroupDetails(){
		greeting();
		intro();
		getSubjects();
	}
	public void getSubjects(){
		 new Subjects().subjectsList("Computer Science");
	}
	
}

class Subjects{
	public void subjectsList(String groupType){
		if(groupType.equals("Bio-Maths")){
			System.out.println("English,Tamil,Maths,Physics,Chemistry,Biology");
		}
		if(groupType.equals("Computer Science")){
			System.out.println("English,Tamil,Maths,Physics,Chemistry,Computer Science");
		}
		
	}
}
