package com.employee.management.factory;

import com.employee.management.dao.IDao;
import com.employee.management.dao.OracleDao;

public class OracleFactory extends AbstractFactory {


	public IDao getDaO() {

		return new OracleDao();
	}

}
