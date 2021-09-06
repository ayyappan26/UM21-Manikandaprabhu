package com.employee;

import com.employee.EmployeDao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;


public class EmployeeBO {
	
	public void employeeSystem(){
		int choice = 0;
		Scanner scan = Scan.getScannerInstance();
		EmployeDao dao = new EmployeDao();
		do{
			System.out.println("1. View Employee");
			System.out.println("2. Register Employee");
			System.out.println("3. Remove Employee ");
			System.out.println("4. Update Employee");
			System.out.println("5. Exit");
			System.out.println("Enter your Choice: ");
			choice = scan.nextInt();
			System.out.println("---------------------------------");
		}while(choice==0);
		
		switch(choice){
		case 1:
			viewEmployees(dao);
			break;
		case 2:
			registerEmployee(dao);
			break;
		case 3:
			deleteEmployee(dao);
			break;
		case 4:
			updateEmployee(dao);
			break;
		case 5:
			return;
		}
		employeeSystem();
	}
	
	public void viewEmployees(EmployeDao dao){
		try {
			dao.viewEmployees();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	public void registerEmployee(EmployeDao dao){
		System.out.println("How many employees registered? ");
		int n=Scan.getScannerInstance().nextInt();
		ArrayList<EmployeeDTO>empDto=new ArrayList<EmployeeDTO>();
		empDto = getEmpDetails(n);
		for(int i=0;i<n;i++) {
			try {
				dao.registerEmployee(empDto.get(i));;
			
			} catch (SQLException e) {
			System.out.println(e.getMessage());
			}
		}
	}
	private void deleteEmployee(EmployeDao empDao) {
		try {
		Scanner scan=Scan.getScannerInstance();
		System.out.println("Enter Employee id to delete :");
		int id=scan.nextInt();
		EmployeeDTO dto=new EmployeeDTO();
		dto.setEmpID(id);
		empDao.deleteEmployee(dto);
		}catch(SQLException e) {
			return;
		}    
		
	} 
	private void updateEmployee(EmployeDao empDao) {
		try {
		Scanner scan=Scan.getScannerInstance();
		System.out.println("Enter EmployeeId to update:");
		int id=scan.nextInt();
		EmployeeDTO dto=new EmployeeDTO();
		dto.setEmpID(id);
		empDao.updateEmployee(dto);
		}catch(SQLException e) {
			return;
		}     
	} 
	

	private ArrayList<EmployeeDTO>getEmpDetails(int n){
	    Scanner scan=Scan.getScannerInstance();
		ArrayList<EmployeeDTO>dto=new ArrayList();
		for(int i=0;i<n;i++) {
			dto.add(new EmployeeDTO());
			System.out.println("Enter Employee Id: ");
            dto.get(i).setEmpID(scan.nextInt());
			System.out.println("Enter First Name : ");
			dto.get(i).setFirstName(scan.next());
			System.out.println("Enter Last Name : ");
			dto.get(i).setLastName(scan.next());
			System.out.println("Enter Salary : ");
			dto.get(i).setSalary(scan.nextFloat());
			System.out.println("Enter Mobile : ");
			dto.get(i).setMobile(scan.nextLong());
			System.out.println("Enter Department : ");
			dto.get(i).setDepartment(scan.next());		
			
		}
		return dto;
	}

}
