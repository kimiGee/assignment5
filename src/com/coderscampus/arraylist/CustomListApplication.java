package com.coderscampus.arraylist;

public class CustomListApplication {

	public static void main(String[] args) {

		CustomArrayList<Integer> myNums = new CustomArrayList<>();

		myNums.add(1);
		myNums.add(2);
		myNums.add(3);
		myNums.add(4);
		myNums.add(5);
		myNums.add(6);
		myNums.add(7);
		myNums.add(8);
		myNums.add(9);
		myNums.add(10);
		myNums.add(11);
		myNums.add(12);
		myNums.add(13);
		myNums.add(14);
		myNums.add(15);
		myNums.add(16);
		myNums.add(17);
		myNums.add(18);
		myNums.add(19);
		myNums.add(20);
		myNums.add(21);
		myNums.add(22);
		myNums.add(23);
		myNums.add(24);
		myNums.add(25);

		for (int x = 0; x < myNums.getSize(); x++) {
			System.out.println(myNums.get(x));
		}

	}

}
