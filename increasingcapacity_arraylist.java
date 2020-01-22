package collections_practise;

import java.util.ArrayList;

public class increasingcapacity_arraylist {

	public static void main(String[] args) {
		 ArrayList<String> list = new ArrayList(6);
	        list.add("a");
	        list.add("b");
	        list.add("c");
	        list.add("d");
	        list.add("e");
	        list.add("f"); 
	        System.out.println("old arraylist:" +list);
	        list.ensureCapacity(6);
	          list.add("1");
	          list.add("2");
	          list.add("3");
	          System.out.println("New array list: " + list);

	}

}
