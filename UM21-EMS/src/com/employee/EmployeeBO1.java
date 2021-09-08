package com.employee;

import java.sql.SQLException;

import com.employee.management.dao.IDao;
import com.employee.management.factory.AbstractFactory;

public class EmployeeBO1 {
	public void employeeGetDetails() throws SQLException{
		AbstractFactory factory = AbstractFactory.getFactory(1);
		IDao dao = factory.getDaO();
		//System.out.println(dao.viewAllEmployeesByDepartment());
		System.out.println(dao.viewEmployeeByDepartment("Dev"));
	}

}
