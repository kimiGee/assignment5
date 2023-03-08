package com.coderscampus.arraylist;

public class CustomListApplication {

	public static void main(String[] args) {

		CustomArrayList<Integer> myNums = new CustomArrayList<>();

		myNums.add(47);
		myNums.add(48);
		myNums.add(32);
		myNums.add(123);
		myNums.add(90);
		myNums.add(3);
		myNums.add(8463);
		myNums.add(0);
		myNums.add(7);
		myNums.add(81);
		myNums.add(9);
		myNums.add(18);
		myNums.add(47);
		myNums.add(48);
		myNums.add(32);
		myNums.add(123);
		myNums.add(90);
		myNums.add(3);
		myNums.add(8463);
		myNums.add(0);
		myNums.add(7);
		myNums.add(81);
		myNums.add(9);
		myNums.add(18);
		myNums.add(472);

		for (int x = 0; x < myNums.getSize(); x++) {
			System.out.println(myNums.get(x));
		}

	}

}
