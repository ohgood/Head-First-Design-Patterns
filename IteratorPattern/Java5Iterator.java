package IteratorPattern;

import java.util.ArrayList;

public class Java5Iterator {
	public static void main(String[] args) {
		ArrayList items = new ArrayList();
		items.add(1);
		items.add(2);
		items.add(3);
		
		for (Object object : items) {
			System.out.println(object);
		}
		
	}

}
