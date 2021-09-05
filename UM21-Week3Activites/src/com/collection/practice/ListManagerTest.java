package com.collection.practice;

import java.util.List;
import java.util.ArrayList;

/**
 * @author R MANI KANDA PRABHU
 * There are Two problem statement
 * Problem Statement 1:
 * Should get the elements of two List and should return only the elements in one list
 * Problem Statement 2:
 * Should get the elements in the array and convert it to the arrayList and sort it and return the shorted arrayList
 */
public class ListManagerTest {
	
	public static void main(String args[]) {
		/**
		 * ArrayList is created with the name list1
		 * The elements are added to the list
		 */
		List<String> list1 = new ArrayList<>();
		list1.add("Chemistry");
		list1.add("Physics");
		list1.add("Biology");
		list1.add("Mathematics");
		list1.add("English");
		list1.add("Tamil");
		/**
		 * ArrayList is created with the name list2
		 * The elements are added to the list
		 */
		List<String> list2 = new ArrayList<String>();
		list2.add("Economics");
		list2.add("Commerce");
		list2.add("Accounts");
		list2.add("Bussiness Maths");
		list2.add("English");
		list2.add("Tamil");
		/**
		 * Instance is created for the class ListManager and removeElements() method is invoked using the reference
		 */
		ListManager obListManager = new ListManager();
		obListManager.removeElements(list1, list2);
		System.out.println(obListManager.removeElements(list1, list2));
		//System.out.println(list1);
		/**
		 *  An array is created  with name arr and the elements are initialized to it.
		 *  Using the instance created for Class ListManager, getArratList() is invoked
		 */
		String arr[] = new String[] { "Prabhu", "Jegan", "Sulthan" };
		System.out.println(obListManager.getArrayList(arr));

	}
}
