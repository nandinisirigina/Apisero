package collections_practise;

import java.util.ArrayList;

public class updating_specificelement {

	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		System.out.println(numbers.toString());
		numbers.set(0, 10);
		System.out.println(numbers.toString());

	}

}
