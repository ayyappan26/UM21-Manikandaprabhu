package com.collection.practice.countrymap;

public class CountryMapDetailsTest {

	public static void main(String[] args) {
		CountryMapDetails myCountryMapDetails =new CountryMapDetails();
		myCountryMapDetails.storeCountryCaptial("India", "Delhi");
		System.out.println(myCountryMapDetails.retrieveCapital("India"));
		System.out.println(myCountryMapDetails.retrieveCountry("Delhi"));
	}

}
