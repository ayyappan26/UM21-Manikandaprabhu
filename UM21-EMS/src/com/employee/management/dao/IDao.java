package com.employee.management.dao;
import com.employee.EmployeeDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public interface IDao {
	public HashMap<String,ArrayList<EmployeeDTO>> viewAllEmployeesByDepartment() throws SQLException;
	public ArrayList<EmployeeDTO> viewEmployeeByDepartment(String dep) throws SQLException;

}
