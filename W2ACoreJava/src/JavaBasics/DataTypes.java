package JavaBasics;

public class DataTypes {
	
	/*
	 * Data Types - whenever we want to store value 
	 * specifying the type of data we want to store in a variable.
	 * 2 major 
	 *  1. Primitive Data types
	 *  	a. Integer: byte, short, int, long
	 *  	b. Decimal: float, double
	 *  	c. yes/no: boolean
	 *  	d. Char: char
	 *  
	 *  
	 *  2. Non Primitive Data types
	 *  	a. Array, String, Class, Interfaces
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		byte id =124; // -128 to +127
		System.out.println(id);
		
		short s1 = 32443 ;  //-32768 to 32767
		System.out.println(s1);
		
		int i1 = 43434; //
		System.out.println(i1);
		
		long L1 = 345666; //
		System.out.println(L1);
		
		float f1 = 45.43f; // you should put f at the end of it, 32 bit - size 
		System.out.println(f1);
		double d1 = 343.545;  //64 bit  - size 
		System.out.println(d1);
		
		//a, b, c
		//single character, use single quotes
		char c1 = 'a'; 
		char c2 = '@';
		System.out.println(c2);
		
		boolean b1 = true;
		System.out.println(b1);
		
		//Java is a case sensitive language.
		
		boolean b2 = false;
		System.out.println(b2);
	}

}
