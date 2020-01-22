package collections_practise;

import java.util.ArrayList;

public class checking_isemptylist {

	public static void main(String[] args) {
		 ArrayList<String> list = new ArrayList();
	        list.add("a");
	        list.add("b");
	        list.add("c");
	        list.add("d");
	        list.add("e");
	        list.add("f"); 
	       boolean value= list.isEmpty();
	       System.out.println(value);

	}

}
