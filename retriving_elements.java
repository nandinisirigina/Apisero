package collections_practise;

import java.util.ArrayList;

public class retriving_elements {

	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		System.out.println(numbers.toString());
		System.out.println("elements retriving based on index");
		System.out.println(numbers.get(2));
		System.out.println(numbers.get(1));
		System.out.println(numbers.getClass());

	}

}
