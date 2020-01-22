package collections_practise;

import java.util.ArrayList;

public class extractportion_arraylist {
	public static void main(String[]args) {
		ArrayList<Integer> numbers=new ArrayList();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		System.out.println(numbers);
	System.out.println((numbers.subList(1, 3)));		
	}
}
