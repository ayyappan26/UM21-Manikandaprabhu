package com.aircraftmaintainancr.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public interface IDao {
	public void addAircraftDetails() throws SQLException;
	public void addSectorDetails() throws SQLException;
	public void viewSectorDetails() throws SQLException;

}
