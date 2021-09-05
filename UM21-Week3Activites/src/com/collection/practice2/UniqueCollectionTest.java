package com.collection.practice2;

/**
 * @author R MANI KANDA PRABHU
 * Values are stored in an array arr
 * An instance for class UniqueCollection is created and getCollection() method is invoked by passing arr as parameter
 */
public class UniqueCollectionTest {

	public static void main(String[] args) {
		String arr[]=new String[]{"car","bike","Aeroplane","bus","car","bike"};
		UniqueCollection myUniqueCollection = new UniqueCollection();
		System.out.println(myUniqueCollection.getCollection(arr));
	}

}
