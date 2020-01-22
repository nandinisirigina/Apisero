package collections_practise;

import java.util.ArrayList;

public class pringelements_basedonindex {

	public static void main(String[] args) {
		 ArrayList<String> list = new ArrayList();
	        list.add("a");
	        list.add("b");
	        list.add("c");
	        list.add("d");
	        list.add("e");
	        list.add("f"); 
	        System.out.println("\nOriginal array list: " + list);
	        System.out.println("\nPrint using index of an element: ");
	        int no_of_elements = list.size();
	        for (int index = 0; index < no_of_elements; index++) {
	         System.out.println(list.get(index));
	}

}
}