package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];

	@Override
	public boolean add(T item) {
		//loop through array to check for null values, adding new item if there is room in the array
		for (int x = 0; x < this.items.length; x++) {
			if (this.items[x] == null) {
				this.items[x] = item;
				return true;
			}
		}
		
		//declare new array with a length double that of the original array
		Object[] newTempArray = new Object[(this.items.length) * 2];
		
		//transfer contents of original array to new array
		for(int x = 0; x < this.items.length; x++) {
			newTempArray[x] = this.items[x];
		}
		
		this.items = newTempArray;

		return true;
	}

	@Override
	public int getSize() {
		int size = 0;
		for(int x = 0; x < this.items.length; x++) {
			if(this.items[x] != null) {
				size++;
			}
		}
		return size;
	}

	@Override
	public T get(int index) {
		return (T)this.items[index];
	}

}
