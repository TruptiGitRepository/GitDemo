package corejavapractice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		//arraylist of type String
		ArrayList<String> list1= new ArrayList<String>();
		
		//Arraylist of any Object type
		 ArrayList list2 = new ArrayList();

		 list1.add("John");
		 list1.add("albert");
		 list1.add("Rehan");
		 list1.add("Tom");
		 list1.add("Bob");
		 list1.add("Catalina");
	System.out.println("the list1 All string type is =" + list1);
	ArrayClassmethods am= new ArrayClassmethods();
	
		list2.add("Trupti");
		list2.add(34);
		list2.add(12.89);
		list2.add('A');
		list2.add(am);
		list2.add(true);
	
	System.out.println("the list2 All  type is =" + list2);
	//to get elements from both types of lists
		String  s= list1.get(3);
		System.out.println("List1  " + s );
	
		Object o= list2.get(2);
		System.out.println("List2 " + o);
	
	//update in list1
		list1.set(0, "Laxmi");
	System.out.println("the list1 All string type is =" + list1);
	//list1.clear(); remove all
	
	//using  forloop to print list1
	
	for(int i=0;i<list1.size();i++)
		 System.out.println(list1.get(i));
	//advance for loop
			System.out.println(" using advance forloop to print list1");
					for(String str : list1 )
						System.out.println(str);
	// using Iterator to print list1	
					Iterator<String> itr= list1.iterator();
					while(itr.hasNext()) {
						System.out.println(itr.next());
					}
				
					//contains() method
					if(list1.contains("albert"))
						System.out.println("List1 contains Albert");
					
	
		}
}
