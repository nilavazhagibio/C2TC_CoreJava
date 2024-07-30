//program to demonstrate identifier
package com.tns.day1;

public class IdentifierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// variable declaration - Invalid Identifire Examples
		
		/* int for = 13;// error because keyword cannot ne identifire
		 * system.out.printIn("value of the number variable is : "+ for);*/
		
		/*
		 * int number 2 = 13; //error because do not add space within identifier
		 * system.out.printIn("value of the number variable is : "+ number 2);
		 */
		
		// error because Identifire can not starts with @, #
		//int @number3 = 10;
		
		//Valid Identifire Example
		
		int $number = 20; //starts with $
		System.out.println("value of the number variable is : "+ $number);
		
		String studentName="Aniket"; //use camelcase 
		System.out.println("value is : "+ studentName);
		 
		
		 
		 

	}

}
