package com.ultramain.um21.vehicle;

import java.util.Date;

public class Vehicle {
	int speed=50;
	String name;
	Date myDate= new Date();
	@SuppressWarnings("deprecation")
	int hours= myDate.getHours();
	
	
		public void getVehicleSpeed(){
			if(hours<18){
				speed= speed+20;
				System.out.println("Vehicle speed="+ speed);
				}
			else{
				System.out.println("Vehicle speed="+speed);
			}
		
	}
	
	public void steering(){
		System.out.println("Vehicle has manual steering");
	}
	
	public void horn(){
		System.out.println("Has steal bell to make sound");
	}
}
	class Car extends Vehicle{
		public void music(){
		    System.out.println("Car has music System");
		}
	}
	class Maruthi extends Car{
	  public void greeting(){
		  	System.out.println("Thanks for Running the program");
	  }
	  public void music(String songName){
		  System.out.println("Music Player Playing" +songName);
	  }
	}

