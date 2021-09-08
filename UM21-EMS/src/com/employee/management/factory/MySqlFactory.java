package com.employee.management.factory;

import com.employee.management.dao.IDao;
import com.employee.management.dao.MySqlDao;

public class MySqlFactory extends AbstractFactory {

	public IDao getDaO() {
		return new MySqlDao(); 
	}

}
