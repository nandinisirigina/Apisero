package collections_practise;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class joinarrays {
		
		    public static void main(String[] args) 
		    {
		        ArrayList<String> list = new ArrayList();
		        list.add("a");
		        list.add("b");
		        list.add("c");
		        list.add("d");
		        list.add("e");
		        list.add("f"); 
		        ArrayList<String> list1 = new ArrayList();
		        list1.add("g");
		        list1.add("h");
		        list1.add("i");
		        list1.add("j");
		        list1.add("k");
		        list1.add("l");  
		        System.out.println(list);
		        System.out.println(list1);
		         list1.addAll(list);  
		        System.out.println(list1);
		    }
		}





