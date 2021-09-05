package com.collection.practice.countryname;

/**
 * @author R MANI KANDA PRABHU
 * 1.	Develop a java class with a instance variable Country  HashSet (H1)  add a method storeCountryNames(String CountryName), 
 * the method should add the passed country to a HashSet (H1) and return the added HashSet(H1).
 * 2.	Develop a method retrieveCountry(String CountryName) which iterates through the HashSet and returns the country if exist else return null
 *
 */
public class CountryNameTest {

	public static void main(String[] args) {
		CountryName newCountryName = new CountryName();
		newCountryName.setCountryName("India");
		newCountryName.setCountryName("America");
		newCountryName.setCountryName("Russia");
		newCountryName.setCountryName("China");
		newCountryName.setCountryName("UK");
		newCountryName.setCountryName("Germany");
		System.out.println(newCountryName.retriveCountry("India"));

	}

}
