package corejavapractice;

public class mathClassmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
		Integer a= x;
		System.out.println(a.compareTo(5));
		System.out.println(a.compareTo(8));
		System.out.println(a.compareTo(3));
		System.out.println(a.equals(8));
		double d= 10.123;
		double f= -12.545;
		//absolute value
		System.out.println(Math.abs(d));
		System.out.println(Math.abs(f));
		//rounding
		System.out.println(Math.round(d));
		System.out.println(Math.round(f));
		
		//Character class
		char z= 'Z';
		char n='*';
		System.out.println(Character.isLetter(z));
		System.out.println(Character.isLetter(n));
		System.out.println(Character.isAlphabetic(n));

	}

}
