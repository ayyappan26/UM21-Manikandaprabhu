package com.ultramain.um21.accesspecifiers;

public class SampleTest {

	public static void main(String[] args) {
		Woman newWoman = new Woman();
		//LivingThings newLivingThings = new LivingThings();
		Man myMan = new Man();
		myMan.Work();
		myMan.eat();
		myMan.sleep();
		System.out.println("-----------------------------------------");
		newWoman.Work();
		newWoman.eat();
		newWoman.sleep();

	}

}

abstract class LivingThings{
	public void eat(){
		System.out.println("Living things eat food to live");
	}
	
	abstract public void Work();
}

abstract class Human extends LivingThings{
	public void sleep(){
		System.out.println("Humans sleep for 8Hours");
	}
}

class Man extends Human{
	public void sleep(){
		System.out.println("Man Sleeps only for 6hours");
	}
	public void Work(){
		System.out.println("Works as a Software Engineer");
	}
}

class Woman extends Human{
	public void sleep(){
		System.out.println("Woman Sleeps for 10 Hours");
	}
	
	public void Work(){
		System.out.println("Works as a Doctor");
	}
	
}