package mapexercises;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmapinsertion {

	public static void main(String[] args) {
		HashMap<Integer,String> hmap=new HashMap<Integer, String>();
		HashMap<Integer,String> hmap1=new HashMap<Integer, String>();
		 hmap.put(1, "Nandini");
		 hmap.put(2, "sindhu");
		 hmap.put(3, "balkis");
		 hmap.put(4, "venkat");
		 for(Entry<Integer, String> x:hmap.entrySet()){  
			   System.out.println(x.getKey()+" "+x.getValue());  
			  }  
		 System.out.println("size of hashmap is" + hmap.size());
		 hmap1.putAll(hmap);
		 System.out.println(hmap1);
		 hmap.clear();
		 System.out.println(hmap);
		 System.out.println(hmap.isEmpty());
		 System.out.println(hmap1.containsKey(2));
		 Set set = hmap.entrySet();
		  // check set values
		  System.out.println("Set values: " + set);
		  System.out.println(hmap1.get(3));
		  System.out.println("collection values are" +hmap1.values());
			 }  
	
			
		
	}


