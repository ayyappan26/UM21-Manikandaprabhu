
package com.ultramain.um21.vehicle2;

public class VechicleTest2 {
	public static void main(String args[]){
		Car myCar = new Car();
		myCar.drive();
		myCar.getCarDetails();
		myCar.getCarWheelCount();
		
	}

}

class Vehicle{
	public void horn(){
		System.out.println("Vechicle has electric horn");
	}
}

class Car extends Vehicle{
	public void drive(){
		System.out.println("Car has Power Steering");
	}
	
	public void getCarDetails(){
		drive();
		horn();	
		System.out.println("Wheel count" +getCarWheelCount());
	}
	public int getCarWheelCount(){
		return new wheel().wheelCount("car");
	}
}
class wheel{
	//public wheel(){
		//System.out.println("HAi this is constructor");
//	}
	public  int wheelCount(String vehicleType){
		if(vehicleType.equals("car")){
			return 4;
		}
		return 0;
	}
	

}





