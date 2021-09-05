package com.collection.practice.countryname;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author R MANI KANDA PRABHU
 * In CountryName class two methods setCountryName() and retriveCountryString()
 */
public class CountryName {
	Set<String> country = new HashSet<>();

	public Set<String> setCountryName(String countryName) {
		country.add(countryName);
		return country;

	}


	public String retriveCountry(String countryName) {
		
		List<String> setCountry = new ArrayList<String>(country);
		for (int i = 0; i < country.size(); i++) {
			if (setCountry.get(i).equals(countryName)) {
				return countryName;
			}

		}
		return null;
	}
}
