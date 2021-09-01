package com.ultramain.um21.studies;

public class Studies {
	public static void main(String args[]){
		//ProffesionalEducation myProffesionalEducation = new ProffesionalEducation();
		//NonProffesionalEducation myNonProffesionalEducation = new NonProffesionalEducation();
		Engineering myEngineering = new Engineering();
		Doctor myDoctor = new Doctor();
		Arts myArts = new Arts();
		Display myDisplay = new Display();
		myDisplay.displayEducation(myEngineering);
		System.out.println("---------------------------------------------------------------------------");
		myDisplay.displayEducation(myDoctor);
		System.out.println("----------------------------------------------------------------------------");
		myDisplay.displayEducation(myArts);
	}
	
}

class Education{
	public void greeting(){
		System.out.println("Welcome To Education");
	}
	public void message(){
		System.out.println("Get Educated in Some field");
	}
}
class ProffesionalEducation extends Education{
	public void intro(){
		System.out.println("In Proffesional Education you learn about a proffesion");
	}
	public void greeing(){
		System.out.println("Welcome To Profesional Education");
	}
	public void message(){
		System.out.println("Get Educated in proffesional studies");
	}
	
}

class NonProffesionalEducation extends Education{
	public void intro(){
		System.out.println("In NonProffesional Education you learn Generaly");
	}
	public void greeting(){
		System.out.println("Welcome to NonProffessional Education");
	}
}

class Engineering extends ProffesionalEducation{
	public void branches(){
		System.out.println("In engineering we have various fields like CSE IT MECH AUTO etc..,");
	}
	public void moto(){
		System.out.println("Our education moto is to develop skilled Enginners");
	}
	
}

class Doctor extends ProffesionalEducation{
	public void moto(){
		System.out.println("Our Education Moto Is To Develop Good Doctors");
	}
}

class Arts extends NonProffesionalEducation{
	public void moto(){
		System.out.println("There is no specific moto");
	}
	
	
}

class Display{
	
	public void displayEducation(Education myEducation){
		
		if(myEducation instanceof ProffesionalEducation){
			ProffesionalEducation myProffesionalEducation= (ProffesionalEducation) myEducation;
			System.out.println("Came with proffessional education");
			myProffesionalEducation.greeing();
			myProffesionalEducation.intro();
			myProffesionalEducation.message();
			
			if(myProffesionalEducation instanceof Engineering){
				Engineering myEngineering = (Engineering) myProffesionalEducation;
				myEngineering.moto();
				myEngineering.branches();
			}
			if(myProffesionalEducation instanceof Doctor){
				Doctor myDoctor= (Doctor) myProffesionalEducation;
				myDoctor.moto();
				
			}
			
		}
		if(myEducation instanceof NonProffesionalEducation){
			NonProffesionalEducation myNonProffesionalEducation= (NonProffesionalEducation) myEducation;
			myNonProffesionalEducation.greeting();
			myNonProffesionalEducation.message();
			
			if(myNonProffesionalEducation instanceof Arts){
				Arts myArts = (Arts) myNonProffesionalEducation;
				myArts.moto();
				
			}
			
		}
		
	}
	
	
	
}








