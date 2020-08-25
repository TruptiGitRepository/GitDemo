package corejavapractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashmapDemo {

	public static void main(String[] args) {
		//Maps have key-value pair; Key is unique but values can be duplicate

		 Map<String,String> m = new HashMap<>();
		 m.put("name", "Trupti");
		 m.put("city", "Dayton");
		 m.put("color", "yellow");
		 m.put("food","chicken");
		 System.out.println(m);
		 System.out.println("Printing value for given key-color: "+ m.get("color"));
		 
		 System.out.println("Printing values for all keys by using Set");	 
		 
		 Set<String> keys= m.keySet(); //all keys stored in Set
		 for(String key : keys)
			 System.out.println( key + " - "+ m.get(key));
		 
	}

}
