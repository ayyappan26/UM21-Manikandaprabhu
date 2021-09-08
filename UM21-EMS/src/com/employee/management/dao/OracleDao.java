package com.employee.management.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.data.DataConnect;
import com.employee.EmployeeDTO;


public class OracleDao implements IDao {


	public HashMap<String, ArrayList<EmployeeDTO>> viewAllEmployeesByDepartment() throws SQLException {
		Connection con = DataConnect.getDbConnection();
		String sqlQuery = "select * FROM employee ORDER BY dept";
	    Statement st = con.createStatement();
		ResultSet rs =  st.executeQuery(sqlQuery);
		EmployeeDTO empDto = new EmployeeDTO();
		ArrayList<EmployeeDTO> empList= new ArrayList<>();
		HashMap<String,ArrayList<EmployeeDTO>> empMap = new HashMap<>();
		int employeeId;
		String firstName;
		String lastName;
		float salary;
		long mobile;
		String department;
		
		while(rs.next()){
			employeeId = rs.getInt(1);
			empDto.setEmpID(employeeId);
			firstName = rs.getString(2);
			empDto.setFirstName(firstName);
			lastName = rs.getString(3);
			empDto.setLastName(lastName);
			salary = rs.getFloat(4);
			empDto.setSalary(salary);
			mobile = rs.getLong(5);
			empDto.setMobile(mobile);
			department = rs.getString(6);
			empDto.setDepartment(department);
			empList.add(empDto);
			for(int i=0;i<empList.size();i++){
			empList.get(i).getEmpID();
			empList.get(i).getFirstName();
			empList.get(i).getLastName();
			empList.get(i).getSalary();
			empList.get(i).getMobile();
			empList.get(i).getDepartment();
			empMap.put(department, empList);
			}
			
		}
		
		return empMap;
		
	}

	
	public ArrayList<EmployeeDTO> viewEmployeeByDepartment(String Dep) throws SQLException {
		ArrayList<EmployeeDTO> empList = null;
		empList = getEmpDetails("Dev");
		return empList;
		
	}
	private ArrayList<EmployeeDTO> getEmpDetails(String depName) throws SQLException{
		ArrayList<EmployeeDTO> empList = new ArrayList<>();
		 Connection con = DataConnect.getDbConnection();
		 String deptQuery = "select EMPLOYEEID, FIRSTNAME, LASTNAME, SALARY, MOBILE FROM employee WHERE DEPT = ?";
		 PreparedStatement pst = con.prepareStatement(deptQuery);
			pst.setString(1, depName);
			ResultSet deptResultSet = pst.executeQuery();
			while(deptResultSet.next()){
				EmployeeDTO empDto  = new EmployeeDTO();
				empDto.setEmpID(deptResultSet.getInt(1));
				empDto.setFirstName(deptResultSet.getString(2));
				empDto.setLastName(deptResultSet.getString(3));
				empDto.setSalary(deptResultSet.getFloat(4));
				empDto.setMobile(deptResultSet.getLong(5));
				empList.add(empDto);
			}
		
		return empList;
	}
	
}
