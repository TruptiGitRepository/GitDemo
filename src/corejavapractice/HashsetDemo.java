package corejavapractice;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo {

	public static void main(String[] args) {
		// urordered and uniuqe elements in Hashset
		HashSet<String> hs = new HashSet<String>();
		hs.add("hello");
		hs.add("green");
		hs.add("yellow");
		hs.add("yellow");
		hs.add("green");
		hs.add("pink");
		hs.add("red");
		System.out.println(hs);
		System.out.println("Printing by advanced forloop");
		for(String s:hs)
			 System.out.println(s);
		
		System.out.println("Printing by iterator");
		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		hs.remove("pink");
		System.out.println(" The new set  " + hs);

		if (hs.contains("red"))
			hs.remove("red");
		System.out.println("Set after removing red  " + hs + " and  Its size " + hs.size());
	}

}
