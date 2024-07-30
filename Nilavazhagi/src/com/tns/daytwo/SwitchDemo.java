//program to demonstrate Switch case
package com.tns.daytwo;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char x = '1';
		switch (x)
		{
		case '1':
		case 'L':
			System.out.println(x+" is a Letter");
			break;
		case 'd':
		case 'D':
			System.out.println(x+" is a digit");
			break;
		case 'w':
		case 'W':
			System.out.println(x+" is White Space");
			break;
		case 's':
		case 'S':
			System.out.println(x+" is Special Symbol");
			default:
				System.out.println(x+" is other then letter, digit, space or special symbol ");
				break;
				
		}

	}

}
