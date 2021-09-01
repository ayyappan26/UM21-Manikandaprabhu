package com.ultramain.um21.intern;

public class Intern {
	private String nameOfIntern;
	private String designation;
	private String collegeName;
	private int sslcMark;
	private int higherSecondaryMark;
	private int universityAggregation;
	public Intern(){
		
	}
	public Intern(String nameOfIntern, String designation, String collegeName,int sslcMark, int higherSecondaryMark,int universityAggregation ){
		this.nameOfIntern=nameOfIntern;
		this.designation=designation;
		this.collegeName=collegeName;
		this.sslcMark=sslcMark;
		this.higherSecondaryMark=higherSecondaryMark;
		this.universityAggregation=universityAggregation;
	}
	public String getNameOfIntern() {
		return nameOfIntern;
	}
	public void setNameOfIntern(String nameOfIntern) {
		this.nameOfIntern = nameOfIntern;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public int getSslcMark() {
		return sslcMark;
	}
	public void setSslcMark(int sslcMark) {
		this.sslcMark = sslcMark;
	}
	public int getHigherSecondaryMark() {
		return higherSecondaryMark;
	}
	public void setHigherSecondaryMark(int higherSecondaryMark) {
		this.higherSecondaryMark = higherSecondaryMark;
	}
	public int getUniversityAggregation() {
		return universityAggregation;
	}
	public void setUniversityAggregation(int universityAggregation) {
		this.universityAggregation = universityAggregation;
	}
	
	

}
