package collections_practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class swapingelements_arraylist {
	
	    public static void main(String[] args) 
	    {
	        ArrayList<String> list = new ArrayList();
	        list.add("a");
	        list.add("b");
	        list.add("c");
	        list.add("d");
	        list.add("e");
	        list.add("f");  
	        System.out.println(list);
	         
	        Collections.swap(list, 1, 2);
	         
	        System.out.println(list);
	    }
	}


