package com.aircraft.bo;

import java.sql.SQLException;
import java.util.Scanner;

import com.aircraft.maintainace.factory.AbstractFactory;
import com.aircraft.util.Scan;
import com.aircraftmaintainancr.dao.IDao;

public class AircraftBO {
	public void acmSystem(){
		AbstractFactory factory = AbstractFactory.getFactory(1);
		IDao dao = factory.getDaO();
		int choice = 0;
		Scanner scan = Scan.getScannerInstance();
		do{
			System.out.println("1. Add Aircraft Details");
			System.out.println("2. Add Sector Details");
			System.out.println("3. View Sector Details");
			System.out.println("4. Exit");
			System.out.println("Enter your Choice: ");
			choice = scan.nextInt();
			System.out.println("---------------------------------");
		}while(choice==0);
		
		switch(choice){
		case 1:
			try {
				dao.addAircraftDetails();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case 2:
			try {
				dao.addSectorDetails();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case 3:
			try {
				dao.viewSectorDetails();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case 4:
			return;
			}
		acmSystem();
	}
	}


