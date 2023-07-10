/**
 * 
 */

/**
 * 
 *Java Basic: Exercise-5 with Solution
Write a Java program that takes two numbers as input and displays the product of two numbers.

Test Data:
Input first number: 25
Input second number: 5

 */

import java.util.Scanner;

public class multiplicacao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 Scanner in = new Scanner(System.in);
   
  System.out.print("Input first number: ");
  int num1 = in.nextInt();
   
  System.out.print("Input second number: ");
  int num2 = in.nextInt();
   
  System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
		 */
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input first number: ");
		int num1 = in.nextInt();
		
		System.out.println("Input second number: ");
		int num2 = in.nextInt();
		
		System.out.println(num1 + "X"+ num2 + " = " + num1*num2);
						
	}

}
