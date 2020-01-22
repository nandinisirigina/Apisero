package collections_practise;

import java.util.ArrayList;

public class comparing_lists {

	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		ArrayList<Integer> numbers1=new ArrayList();
		numbers1.add(1);
		numbers1.add(2);
		numbers1.add(3);
		numbers1.add(4);
		boolean value=numbers.equals(numbers1);
		System.out.println(value);

	}

}
