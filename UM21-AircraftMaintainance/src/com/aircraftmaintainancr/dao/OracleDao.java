package com.aircraftmaintainancr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import com.aircraft.util.Scan;
import com.aircraftmaintainance.dto.AircraftDTO;
import com.data.DataConnect;




public class OracleDao implements IDao {
	

	
	public void addAircraftDetails() throws SQLException {
		System.out.println("How Many Aircraft Details to be added:");
		int n =Scan.getScannerInstance().nextInt();
		ArrayList<AircraftDTO>acraftList = new ArrayList<>();
		AircraftDTO acraftDto = new AircraftDTO();
		acraftList = setAircraftDetails(n);
		for(int i=0;i<n;i++){
		acraftDto = acraftList.get(i);
		Connection con = DataConnect.getDbConnection();
		String sqlQuery = "INSERT INTO aircraft VALUES(?,?)";
		PreparedStatement pst = con.prepareStatement(sqlQuery);
		pst.setString(1, acraftDto.getAircraftCode() );
		pst.setString(2, acraftDto.getAirctaftDescription());
		int rowsUpdated = pst.executeUpdate();
		System.out.println("Rows Updated: "+rowsUpdated);
		}
	
	}

	
	public void addSectorDetails() throws SQLException {
		getAircraftDetails();
		System.out.println("How Many Sectors to be registered: ");
		int n = Scan.getScannerInstance().nextInt();
		ArrayList<AircraftDTO>sectorList= new ArrayList<>();
		AircraftDTO acraftDto = new AircraftDTO();
		sectorList = setSectorDetails(n);
		for(int i =0; i<n;i++){
			acraftDto = sectorList.get(i);
			Connection con = DataConnect.getDbConnection();
			String sqlQuery = "INSERT INTO sector VALUES(?,?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(sqlQuery);
			pst.setString(1, acraftDto.getSectorId());
			pst.setString(2, acraftDto.getAircraftCode());
			pst.setString(3, acraftDto.getFromStation());
			pst.setString(4, acraftDto.getToStation());
			pst.setString(5, acraftDto.getScheduleDate());
			pst.setInt(6, acraftDto.getTime());
			int rowsUpdated = pst.executeUpdate();
			System.out.println("Rows Updated: "+rowsUpdated);
			
		}
		
		
		
		
	}

	
	public void viewSectorDetails() throws SQLException {
		System.out.println("1.View Sector Details by Sector ID");
		System.out.println("2. View Sector Details by Aircraft Code");
		System.out.println("Enter your choice: ");
		int choice= Scan.getScannerInstance().nextInt();
		switch(choice){
		case 1:
		{
			System.out.println("Enter Sector Id ");
			String secID= Scan.getScannerInstance().next();
			getSectorDetailsBySectorID(secID);
			break;
		}
		case 2:
		{
			System.out.println("Enter Aicraft code ");
			String acCode= Scan.getScannerInstance().next();
			getSectorDetailsByAircraftCode(acCode);
			break;
		}
		default:
		{
			System.out.println("Enter valid choice.");
		}
		
		}
		
	}
	private ArrayList<AircraftDTO>setAircraftDetails(int n){
		Scanner scan = Scan.getScannerInstance();
		ArrayList<AircraftDTO>dtoList = new ArrayList<>();
		for(int i=0; i<n;i++){
			dtoList.add(new AircraftDTO());
			System.out.println("Enter Aircraft Code :");
			dtoList.get(i).setAircraftCode(scan.next());
			System.out.println("Enter Aircraft Description:");
			dtoList.get(i).setAirctaftDescription(scan.next());
			System.out.println("-------------------------------------");
		}
		return dtoList;
	}
	private void getAircraftDetails() throws SQLException{
		Connection con = DataConnect.getDbConnection();
		String acQuery = "select aircraft_code,aircraft_description FROM aircraft";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(acQuery);
		
		String aircraftCode;
		String aircraftDescription;
		
		while(rs.next()){
			aircraftCode = rs.getString(1);
			System.out.println("Aircraft Code: "+aircraftCode);
			aircraftDescription = rs.getString(2);
			System.out.println("Aircraft Description: "+aircraftDescription);
			System.out.println("----------------------------------------------");
		}
		
		
	}
	private ArrayList<AircraftDTO>setSectorDetails(int n){
		Scanner scan = Scan.getScannerInstance();
		ArrayList<AircraftDTO>dtoList = new ArrayList<>();
		for(int i=0; i<n;i++){
			dtoList.add(new AircraftDTO());
			System.out.println("Enter Sector ID :");
			dtoList.get(i).setSectorId(scan.next());
			System.out.println("Enter Aircraft code From the list Given Above: ");
			dtoList.get(i).setAircraftCode(scan.next());
			System.out.println("Enter from airport:");
			dtoList.get(i).setFromStation(scan.next());
			System.out.println("Enter To airport:");
			dtoList.get(i).setToStation(scan.next());
			System.out.println("Enter Schedule Date:");
			dtoList.get(i).setScheduleDate(scan.next());
			System.out.println("Enter Schedule Time: ");
			dtoList.get(i).setTime(scan.nextInt());
			System.out.println("-------------------------------------");
			
		}
		return dtoList;
	}
	private void getSectorDetailsBySectorID(String sectorID) throws SQLException{
		Connection con = DataConnect.getDbConnection();
		String secQuery = "select sector_id,aircraft_code, from_station, to_station, schedule_date, schedule_time FROM sector WHERE sector_id= ?";
		PreparedStatement pst = con.prepareStatement(secQuery);
		pst.setString(1, sectorID);
		ResultSet secResultSet = pst.executeQuery();
		String sectorId;
		String aircraftCode;
		String fromStation;
		String toStation;
		String secheduleDate;
		int secheduleTime;
		
		
		while(secResultSet.next()){
			sectorId = secResultSet.getString(1);
			System.out.println("Sector ID: "+sectorId);
			aircraftCode = secResultSet.getString(2);
			System.out.println("Aircraft Code: "+aircraftCode);
			fromStation = secResultSet.getString(3);
			System.out.println("From Airport :"+fromStation);
			toStation = secResultSet.getString(4);
			System.out.println("To Airport :" +toStation);
			secheduleDate = secResultSet.getString(5);
			System.out.println("Sechduled Date: " +secheduleDate);
			secheduleTime = secResultSet.getInt(6);
			System.out.println("Sechduled Time: "+secheduleTime);
			System.out.println("----------------------------------------------");
		}
	}
	
	private void getSectorDetailsByAircraftCode(String acCode) throws SQLException{
		Connection con = DataConnect.getDbConnection();
		String secQuery = "select sector_id,aircraft_code, from_station, to_station, schedule_date, schedule_time FROM sector WHERE aircraft_code= ?";
		PreparedStatement pst = con.prepareStatement(secQuery);
		pst.setString(1, acCode);
		ResultSet secResultSet = pst.executeQuery();
		String sectorId;
		String aircraftCode;
		String fromStation;
		String toStation;
		String secheduleDate;
		int secheduleTime;
		
		
		while(secResultSet.next()){
			sectorId = secResultSet.getString(1);
			System.out.println("Sector ID: "+sectorId);
			aircraftCode = secResultSet.getString(2);
			System.out.println("Aircraft Code: "+aircraftCode);
			fromStation = secResultSet.getString(3);
			System.out.println("From Airport :"+fromStation);
			toStation = secResultSet.getString(4);
			System.out.println("To Airport :" +toStation);
			secheduleDate = secResultSet.getString(5);
			System.out.println("Sechduled Date: " +secheduleDate);
			secheduleTime = secResultSet.getInt(6);
			System.out.println("Sechduled Time: "+secheduleTime);
			System.out.println("----------------------------------------------");
		}
	}
	
}
