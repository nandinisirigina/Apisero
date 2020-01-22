package collections_practise;

import java.util.ArrayList;

public class replacinglist {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList(6);
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f"); 
        System.out.println(list);
        list.set(2, "replace");
        System.out.println(list);

	}

}
