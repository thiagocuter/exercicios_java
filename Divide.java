/**
 * 
 */
package divide;

/**
 * @author Acer
 *
 */

import java.util.Scanner;

public class Divide {

	/**
	 * 
	 * https://www.w3resource.com/java-exercises/basic/java-basic-exercise-3.php
	 * 
	 * Write a Java program to divide two numbers and print them on the screen.
Test Data :
50/3
Expected Output :
16
	 */
	public static void main(String[] args) {
		
		//System.out.println("A dividão de 50/3: " + 50/3);
		
		/**
		 import java.util.Scanner;

public class Main {
  public static void main(String[] args) 
  {
    Scanner input = new Scanner (System.in);
    System.out.print("Input the first number: ");
    int a = input.nextInt();
    System.out.print("Input the second number: ");
    int b = input.nextInt();
    int d = (a/b);
    System.out.println();
    System.out.println("The division of a and b is:" +d);
  }
}
		 */
		
		Scanner input = new Scanner (System.in);
		System.out.print("Input the first numer: ");
		int a = input.nextInt();
		System.out.print("Input the second number: ");
		int b = input.nextInt();
		
		int c = (a/b);
		System.out.println();
		System.out.println("The division of a for b is: " + c);
	}

}
