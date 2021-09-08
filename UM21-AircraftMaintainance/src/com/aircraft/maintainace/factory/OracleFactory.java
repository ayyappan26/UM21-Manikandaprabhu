package com.aircraft.maintainace.factory;

import com.aircraftmaintainancr.dao.IDao;
import com.aircraftmaintainancr.dao.OracleDao;

public class OracleFactory extends AbstractFactory {


	public IDao getDaO() {

		return new OracleDao();
	}

}
