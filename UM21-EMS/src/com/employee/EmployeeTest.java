package com.employee;

import java.sql.SQLException;

public class EmployeeTest {
	public static void main(String[] args) {
		EmployeeBO1 bo = new EmployeeBO1();
		try {
			bo.employeeGetDetails();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}
}
