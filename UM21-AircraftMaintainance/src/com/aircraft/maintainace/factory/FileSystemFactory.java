package com.aircraft.maintainace.factory;


import com.aircraftmaintainancr.dao.FilesSystemDao;
import com.aircraftmaintainancr.dao.IDao;

public class FileSystemFactory extends AbstractFactory{

	
	public IDao getDaO() {
		
		return new FilesSystemDao();
	}

}
