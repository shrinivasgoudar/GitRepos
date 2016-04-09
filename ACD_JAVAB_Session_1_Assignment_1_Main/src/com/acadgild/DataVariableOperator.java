/**
 * 
 */
package com.acadgild;

/**
 * @author shrinivasa.goudar
 *
 */
public class DataVariableOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Sum Of Two Different Number Program!!!");
		// Declaration of variables
		//Datatype variable1, variable2
		int number1,result;
		//Datatype variable1, variable2
		float number2;
		
		// Assigning the int value to number1 variable
		number1 = 10;
		//Assigning the float value to number2 variable
		number2 = 10.20f;
		
		//Printing two numbers
		System.out.println("1. number  1  is :"+number1);
		System.out.println("2. number  2  is :"+number2);
		// Addition operation and storing the result  in result variable and type casting from float to int(widening casting)
		result = number1 + (int) number2;
		System.out.println("Sum  of two numbers["+number1 +" and " + number2+"]: " + result);

	}

}
