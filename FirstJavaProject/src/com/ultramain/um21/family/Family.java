package com.ultramain.um21.family;

public class Family {
	public Family(){
		System.out.println("Default Family Constructor");
	}

}
class Dad extends Family{
	//public Dad(){
		//System.out.println("Default Dad Constructor...");
	//}
	public void earnMoney(){
		System.out.println("Earning Money from bussiness...");
	}
}

class Son extends Dad{
	public void playGame(){
		System.out.println("Playing VollyBall");
	}
	public void earnMoney(String earnType){
		System.out.println("Son earns money using:"+earnType);
		
	}
	public void earnMoney(String earnType, int daysWorked){
		System.out.println("Son Earns money using" +earnType);
		System.out.println("Total days worked" +daysWorked);
	}
}