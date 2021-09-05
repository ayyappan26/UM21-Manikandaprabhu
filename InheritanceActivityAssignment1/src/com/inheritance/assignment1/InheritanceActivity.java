package com.inheritance.assignment1;

public class InheritanceActivity {

	public static void main(String[] args) {
		Manager myManager = new Manager(126534,"Peter","chennai India", 237844,65000);
		myManager.calculateSalary();
		myManager.calcultaeTransportAllowance();
		System.out.println("----------------------------------------------------");
		Trainee myTrainee = new Trainee(29846,"Jack", "Mumbai India",442085,45000);
		myTrainee.calculateSalary();
		myTrainee.calcultaeTransportAllowance();

	}

}

class Employee{
	protected long employeeID;
	protected String employeeName;
	protected String employeeAddress;
	protected long employeePhone;
	protected double basicSalary;
	protected double specialAllowance =250.80;
	protected double Hra=1000.50;
	protected double transportAllowance;
	public Employee(){
		
	}
	
	public Employee(long Id,String Name, String address, long phone){
		this.employeeID= Id;
		this.employeeName= Name;
		this.employeeAddress = address;
		this.employeePhone= phone;
		
	}
	public void employeeDetails(){
	    System.out.println(employeeID);
		System.out.println(employeeName);
		System.out.println(employeeAddress);
		System.out.println(employeePhone);
	}
	
	public void calculateSalary(){
		employeeDetails();
		double Salary;
		Salary = basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*Hra/100);
		System.out.println("Your salary is "+Salary);
		
	}
	
	public void calcultaeTransportAllowance(){
				transportAllowance = basicSalary*10/100;
				System.out.println("Your Transport Allowance" +transportAllowance);
	}
}

class Manager extends Employee{
	
	public Manager(long Id,String Name, String address, long phone, double salary){
		this.employeeID = Id;
		this.employeeName = Name;
		this.employeeAddress= address;
		this.employeePhone = phone;
		this.basicSalary = salary;
	}
	
	
	public void calcultaeTransportAllowance(){
		
		
		transportAllowance = basicSalary*15/100;
		System.out.println("Your Transport Allowance is: " +transportAllowance);
	}
	

}

class Trainee extends Employee{

	
	public  Trainee(long Id,String Name, String address, long phone, double salary){
		this.employeeID = Id;
		this.employeeName = Name;
		this.employeeAddress= address;
		this.employeePhone = phone;
		this.basicSalary = salary;
	}
}




















