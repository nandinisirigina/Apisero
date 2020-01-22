package collections_practise;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class iteratingelements_arraylist {

	public static void main(String[] args) {
		 ArrayList<String> arrl = new ArrayList<String>();
	       
	        arrl.add("First");
	        arrl.add("Second");
	        arrl.add("Third");
	        arrl.add("Random");
	        /*Iterator<String> itr = arrl.iterator();
	        while(itr.hasNext()){
	            System.out.println(itr.next());
	        }*/
	        for(String elements:arrl)
	        {
	        	System.out.println(arrl);
	        }
	        
	    }
	}

	
