package com.aircraftmaintainance.dto;



public class AircraftDTO {
	private String aircraftCode;
	private String airctaftDescription;
	private String sectorId;
	private String fromStation;
	private String toStation;
	private String scheduleDate;
	private int time;

	public String getAircraftCode() {
		return aircraftCode;
	}

	public void setAircraftCode(String aircraftCode) {
		this.aircraftCode = aircraftCode;
	}

	public String getAirctaftDescription() {
		return airctaftDescription;
	}

	public void setAirctaftDescription(String airctaftDescription) {
		this.airctaftDescription = airctaftDescription;
	}

	public String getSectorId() {
		return sectorId;
	}

	public void setSectorId(String sectorId) {
		this.sectorId = sectorId;
	}

	public String getFromStation() {
		return fromStation;
	}

	public void setFromStation(String fromStation) {
		this.fromStation = fromStation;
	}

	public String getToStation() {
		return toStation;
	}

	public void setToStation(String toStation) {
		this.toStation = toStation;
	}

	public String getScheduleDate() {
		return scheduleDate;
	}

	public void setScheduleDate(String string) {
		this.scheduleDate = string;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

}
