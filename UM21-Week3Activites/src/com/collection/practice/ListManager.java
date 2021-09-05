package com.collection.practice;

import java.util.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author R MANI KANDA PRABHU
 * ListManager is created to perform two methods removeElements() and getArrayList()
 * 
 */
public class ListManager {

	/**
	 * @param list1
	 * @param list2
	 * removeElements() method is used To retain all the elements in list2
	 * @return list2
	 */
	public List<String> removeElements(List<String> list1, List<String> list2) {
		list2.retainAll(list1);
		return list2;

	}
	

	/**
	 * @param arr
	 * getArrayList method is used to get array from the user and store it in the 
	 * @return arrList
	 */
	public List<String> getArrayList(String[] arr) {
		List<String> arrList = new ArrayList<String>();

		arrList = Arrays.asList(arr);
		Collections.sort(arrList);
		return arrList;
	}
}
