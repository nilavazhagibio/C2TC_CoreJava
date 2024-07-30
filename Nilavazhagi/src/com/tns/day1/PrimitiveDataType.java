//program demonstrate data type 
package com.tns.day1;

public class PrimitiveDataType {

	public static void main(String[] args) {
		// byte takes 1 byte
		byte bytemax = 127;
		byte bytemin = -128;
		
		System.out.println("Min range of byte is" + bytemin+"Max range of byte is" + bytemax);
		
		//short - 2 bytes
		short shortMax = 32767;
		short shortMin = -32768;
		System.out.println("Minint range of byte is" + shortMin+"Maxint range of byte is" +shortMax);
		
		//int - 4bytes
		long maxLong = 922337203685477580L;
		long minLong = -9223372036854775808L;
		
		System.out.println("Minlong range of byte is" + maxLong+"maxlong range of byte is"+maxLong);
		
		float f=3234.141243278345f;
		double d=3456.14124512345678902345678914f;
		System.out.println("float value is "+f+"double value is "+d);
		
		//boolean
		boolean flag=false;
		System.out.println("boolean value is"+flag);

		
		
		

	}

}
