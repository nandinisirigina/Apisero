package collections_practise;

import java.util.ArrayList;

public class trim_arraylist {

	public static void main(String[] args) {
		 ArrayList<String> list = new ArrayList();
	        list.add("a");
	        list.add("b");
	        list.add("c");
	        list.add("d");
	        list.add("e");
	        list.add("f"); 
	        System.out.println(list.size());
	        list.trimToSize();
	        System.out.println(list.size());

	}

}
