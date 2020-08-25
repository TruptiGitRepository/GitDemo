package corejavapractice;

public class Hello {

	public static void main(String[] args) {
		// String class methods
		String s1= "selenium";
		String s2= "SELENIUM";
		String s3= "TrEntonTHUNDER";
		String s4= "WELCOME TO SELENIUM TESTING";
		System.out.println("compareTo  " + s1.compareTo(s2)); // s1-s2=+ve
		System.out.println("compareToIgnorecase  " + s1.compareToIgnoreCase(s2)); // 0 as case is ignored
		System.out.println("equals " + s1.equals(s2)); // false
		System.out.println("with == operator  " + (s1==s2));
		  String v2= s3.substring(7);
		  System.out.println("substring " + v2);
		  
		  String v3 = s3.substring(6,11);
		  System.out.println(" substring  "+ v3);
		  
		  String v4= s4.substring(11,20);
		  System.out.println(" substring  "+ v4);
		 // System.out.println("substring " + v3);
		 // System.out.println("toUpperCase  " + s3.toUpperCase());
		 // System.out.println("toLowersrCase  " + s3.toLowerCase());
		  System.out.println("CharAt()  " + s3.charAt(4));
		  System.out.println("For Git DEMO");
		  System.out.println("For Git DEMO");
		  System.out.println("For Git DEMO");
		  // adding this changes from my side
		  System.out.println("From GitStuff");
		  System.out.println("From GitStuff");
		  System.out.println("From GitStuff");
	}

}
