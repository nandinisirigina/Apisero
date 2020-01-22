package collections_practise;

import java.util.ArrayList;
import java.util.Collections;

public class shuffle_elements {

	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList();
		numbers.add(4);
		numbers.add(1);
		numbers.add(3);
		numbers.add(2);
		System.out.println(numbers);
		Collections.shuffle(numbers);
System.out.println(numbers);

	}

}
