package com.practice.students.mark;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class StudentsMarks {

	public static void main(String[] args) {
		HashMap<Integer,Integer> studMap = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number students marks to be updated:");
		int num= scan.nextInt();
		for(int i=1;i<=num;i++){
			System.out.println("Enter the Student Register Number: ");
		Integer regNumber = scan.nextInt();
		System.out.println("Enter the Student Mark: ");
		Integer marks = scan.nextInt();
		studMap.put(regNumber, marks);
		System.out.println("--------------------------");
		}
		System.out.println("==============================================");
		System.out.println(getStudents(studMap));
	}

	

	public static HashMap<Integer,String> getStudents(HashMap<Integer,Integer> hmap){
		HashMap<Integer,String> resMap = new HashMap<>();
		for(Entry<Integer, Integer> entry:hmap.entrySet()){
			if(entry.getValue()>=90){
				resMap.put(entry.getKey(), "Gold");
				return resMap;
			}
			if((entry.getValue()>=80) &&(entry.getValue()<90) ){
				resMap.put(entry.getKey(), "Silver");
				return resMap;
				
			}
			if((entry.getValue()>=70)&&(entry.getValue()<80)){
				resMap.put(entry.getKey(), "Bronze");
				return resMap;
			}
		}
		return resMap;
		
}
}
