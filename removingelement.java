package collections_practise;

import java.util.ArrayList;

public class removingelement {

	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		System.out.println(numbers.toString());
		numbers.remove(2);
		System.out.println(numbers);

	}

}
