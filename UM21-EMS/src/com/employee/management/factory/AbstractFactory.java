package com.employee.management.factory;

import com.employee.management.dao.IDao;

public abstract class AbstractFactory {
	public abstract IDao getDaO();
	
	public static AbstractFactory getFactory (int choice){
		AbstractFactory factory = null;
		switch(choice){
		case 1:
			factory = new OracleFactory();
			break;
		case 2:
			factory = new MySqlFactory();
			break;
		case 3:
			factory = new FileSystemFactory();
			break;
		}
		
		return factory;
	}

}
