package collections_practise;

import java.util.ArrayList;
import java.util.Collections;

public class copyingarraylist {

	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		ArrayList<Integer> numbers1=new ArrayList();
		numbers1.add(5);
		numbers1.add(6);
		numbers1.add(7);
		numbers1.add(8);
		Collections.copy(numbers1, numbers);
		System.out.println(numbers1);

	}

}
