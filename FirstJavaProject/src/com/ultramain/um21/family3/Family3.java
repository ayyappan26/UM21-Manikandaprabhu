package com.ultramain.um21.family3;

public class Family3 {
	public static void main(String args[]){
		Son mySon= new Son();
		Daughter myDaughter = new Daughter();
		Display display = new Display();
		//display.displayMySonDetails(mySon);
		//display.displayMyDaughterDetails(myDaughter);
		display.displayKidDetails(myDaughter);
		System.out.println("-------------------------------------------");
		display.displayKidDetails(mySon);
		
	}

}
class Father{
	public void sleep(){
		System.out.println("Grandfather Sleep for 4Hours");
	}
}

class Dad extends Father{
	public void eat(){
		System.out.println("Dad eats Chicken");
	}
	public void earn(){
		System.out.println("Dad doing bussiness for earning money....");
	}
}

class Son extends Dad{
	public void eat(){
		System.out.println("Son eats Pizza");
	}
	public void swim(){
		System.out.println("Son can swim....");
	}
	
}

class Daughter extends Dad{
	public void eat(){
		System.out.println("Daughter eats Noodles");
	}
	public void sing(){
		System.out.println("Daughter can Swim....");
	}
}

class Display{
	public void displayMySonDetails(Son mySon){
		mySon.eat();
		mySon.earn();
		mySon.swim();
		mySon.sleep();
		System.out.println("--------------------------------------------------------------------------------");
		
	}
	
	public void displayMyDaughterDetails(Daughter myDaughter){
		myDaughter.eat();
		myDaughter.sing();
		myDaughter.earn();
		myDaughter.sleep();
		System.out.println("----------------------------------------");
		
	}
	
	public void displayKidDetails(Dad myDad){
		
		if(myDad instanceof Son){
			System.out.println("Came with Son");
			Son mySon = (Son) myDad;
			mySon.swim();
			mySon.earn();
			mySon.eat();
			mySon.sleep();
			
		}
		if(myDad instanceof Daughter){
			System.out.println("Came with daughter");
			Daughter myDaughter= (Daughter) myDad;
			myDaughter.sing();
			myDaughter.earn();
			myDaughter.eat();
			myDaughter.sleep();
		}
		
		//myDad.eat();
		//myDad.earn();
		//myDad.sleep();
		
	}
	
}
