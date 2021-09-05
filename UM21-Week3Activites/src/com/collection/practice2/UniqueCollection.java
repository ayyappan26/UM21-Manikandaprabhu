package com.collection.practice2;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author R MANI KANDA PRABHU
 * UniqueCollection is class with method getCollection()
 * 
 */
public class UniqueCollection {
	/**
	 * @param elements
	 * The elements are stored in the TreeSet
	 * @return mySet of type Set
	 */
	public Set<String> getCollection(String[] elements) {
		Set<String> mySet = new TreeSet<>(Arrays.asList(elements));
		return mySet;

	}

}
