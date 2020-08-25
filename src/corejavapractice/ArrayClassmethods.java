package corejavapractice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayClassmethods {

	public static void main(String[] args) {
		int []myarr= {11,22,33,44,55};
		System.out.println(myarr.length);
		
         String s= Arrays.toString(myarr); //the whole array is returned as string
         System.out.println(s);
         
         String []str = { "SELENIUM", "UFT","LOADRUNNER","RFT"};
         System.out.println(Arrays.toString(str));
       List<String> l=  Arrays.asList(str); // array is converted into type List
       System.out.println(l.contains("UFT"));
       System.out.println(l.contains("JAVA"));
       
	}
	
	
	
	

}
