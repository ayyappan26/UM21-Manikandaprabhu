package com.aircraft.util;
import com.aircraft.bo.AircraftBO;

public class AircraftTest {
	public static void main(String[]args){
		AircraftBO  aBO =new AircraftBO();
		System.out.println("Welcome to Aircraft Maintainance System");
		System.out.println("---------------------------------------");
		aBO.acmSystem();
	}

}
