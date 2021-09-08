package com.aircraft.maintainace.factory;

import com.aircraftmaintainancr.dao.IDao;
import com.aircraftmaintainancr.dao.MySqlDao;

public class MySqlFactory extends AbstractFactory {

	public IDao getDaO() {
		return new MySqlDao(); 
	}

}
