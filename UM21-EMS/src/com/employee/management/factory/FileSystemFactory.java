package com.employee.management.factory;


import com.employee.management.dao.FilesSystemDao;
import com.employee.management.dao.IDao;

public class FileSystemFactory extends AbstractFactory{

	
	public IDao getDaO() {
		
		return new FilesSystemDao();
	}

}
