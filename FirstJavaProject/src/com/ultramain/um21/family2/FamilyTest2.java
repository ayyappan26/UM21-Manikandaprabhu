package com.ultramain.um21.family2;

public class FamilyTest2 {
	public static void main(String args[]){
		Father myFather=new Son();
		myFather.sleep();
		myFather.eat();
		
	}
}

class GrandFather{
	public void eat(){
		System.out.println("Eats only Veg");
	}
}

class Father extends GrandFather{
	public void sleep(){
		System.out.println("Father ask to sleep 8 hours a day");
	}
}

class Son extends Father{
	public void play(){
		System.out.println("Playing Volly Ball");
	}
	public void eat(){
		super.eat();
		System.out.println("Eats only Non Veg");
	}
}
class Daughter extends Father{
	public void play(){
		System.out.println("Playing Basketball");
	}
}