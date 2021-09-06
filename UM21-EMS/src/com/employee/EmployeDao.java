package com.employee;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.data.DataConnect;

public class EmployeDao {
	public void viewEmployees() throws SQLException{
			Connection con = DataConnect.getDbConnection();
			String sqlQuery = "select * FROM employee ORDER BY employeeid";
		    Statement st = con.createStatement();
			ResultSet rs =  st.executeQuery(sqlQuery);
			
			int employeeId;
			String firstName;
			String lastName;
			float salary;
			long mobile;
			String department;
			
			while(rs.next()){
				employeeId = rs.getInt(1);
				firstName = rs.getString(2);
				lastName = rs.getString(3);
				salary = rs.getFloat(4);
				mobile = rs.getLong(5);
				department = rs.getString(6);
				
				System.out.println("Employee ID: " + employeeId);
				System.out.println("First Name : " + firstName);
				System.out.println("Last Name  : " + lastName);
				System.out.println("Salary     : " + salary);
				System.out.println("Mobile     : " + mobile);
				System.out.println("Department : " +  department);
				System.out.println("----------------------------------");
			}
		}

		
		public void registerEmployee(EmployeeDTO empDto) throws SQLException{
			Connection con = DataConnect.getDbConnection();
			
			String sql = "INSERT INTO employee VALUES (?,?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, empDto.getEmpID());
			pst.setString(2, empDto.getFirstName());
			pst.setString(3, empDto.getLastName());
			pst.setFloat(4, empDto.getSalary());
			pst.setLong(5, empDto.getMobile());
			pst.setString(6, empDto.getDepartment());
			System.out.println("---------------------------------");
			int rowsUpdated = pst.executeUpdate();
			
			System.out.println("Rows Updated : " + rowsUpdated);	
		}
		
		
		
		public void deleteEmployee(EmployeeDTO empDto) throws SQLException{
			Connection con=DataConnect.getDbConnection();
			String sql="DELETE FROM employee where employeeId=?";
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setInt(1, empDto.getEmpID());
			int rowsAffected=pst.executeUpdate();
		   System.out.println("Rows deleted :"+rowsAffected);
			
		}
		
	    
		
	    public void updateEmployee(EmployeeDTO empDto) throws SQLException{
			Connection con=DataConnect.getDbConnection();
			System.out.println("Enter new employee id :");
			String sql="UPDATE employee SET employeeId="+Scan.getScannerInstance().nextInt()+"where employeeId=?";
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setInt(1, empDto.getEmpID());
			int rowsAffected=pst.executeUpdate();

			System.out.println("Rows updated :"+rowsAffected);
		}   

}
