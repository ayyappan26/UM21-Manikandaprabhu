package com.collection.practice.countrymap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountryMapDetails {
	HashMap<String,String> countryMap = new HashMap<>();
	Set<String> key= countryMap.keySet();
	public HashMap<String,String> storeCountryCaptial(String countryName, String countryCapital){
		countryMap.put(countryName, countryCapital);
		return countryMap;
	}
	
	public String retrieveCapital(String countryName){
		if(countryMap.containsKey(countryName)){
			return countryMap.get(countryName);
		}
		return null;
	}

	public String retrieveCountry(String captialName)
	{
		for(Entry<String, String> entry: countryMap.entrySet())
		{
			if(entry.getValue() == captialName) 
			{
				return entry.getKey();
			}
		}
		return null;
	}
}
	
	