package collections_practise;

import java.util.ArrayList;

public class cloningarray {

	public static void main(String[] args) {
		 ArrayList<String> list = new ArrayList();
	        list.add("a");
	        list.add("b");
	        list.add("c");
	        list.add("d");
	        list.add("e");
	        list.add("f");  
	        System.out.println("original array" + list);
	        ArrayList<String> list1 = (ArrayList<String>)list.clone();
	        System.out.println("cloned array" + list1);

	}

}
