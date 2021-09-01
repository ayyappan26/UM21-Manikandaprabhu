package com.ultramain.um21.vehicleregistration;

import java.util.ArrayList;

public class VehicleRegistration {
	public void getLuckyNumber(int luckyNumber) {
		// int result[] = new int[9999];
		ArrayList<Integer> resultList = new ArrayList<>();
		// int index = 0;

		int curValue = 0;
		int sum = 0;
		for (int i = 1; i <= 9999; i++) {
			if ((i < 10) && (i == luckyNumber)) {
				Integer wI = new Integer(i);
				resultList.add(wI);
				// resultList.add(i); //AutoBoxing
				// result[index]= i;
				// index ++;
			} else if (i >= 10) {
				curValue = i;
				while (curValue > 0) {
					sum = sum + curValue % 10;
					curValue = curValue / 10;
				}
				if (sum > 10) {
					curValue = sum;
					sum = sum + curValue % 10;
					curValue = curValue / 10;
				}

			}
			if (sum == luckyNumber) {
				resultList.add(i);
				// result[index]=i;
				// index++;
			}
			sum = 0;
		}
		for (int x : resultList) {
			if (x > 0) {
				System.out.println(x);
			}
		}
	}

	public void ArrayListShort() {
		short s;
		ArrayList<Short> resultList2 = new ArrayList<Short>();
		for (short i = 526; i <= 9999; i++) {
			s = i;
			Short wS = new Short(s);
			resultList2.add(wS);
		}
		for (int x : resultList2) {
			if (x > 0) {
				System.out.println(x);
			}

		}
	}
}