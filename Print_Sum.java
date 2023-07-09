/**
 * 
 */

/**
 Java Basic: Exercise-2 with Solution
Write a Java program to print the sum of two numbers.

In mathematics, summation (capital Greek sigma symbol: 
∑) is the addition of a sequence of numbers; the result is their sum or total. 
The numbers to be summed may be integers, rational numbers, real numbers, or 
complex numbers.

Resposta do site: https://www.w3resource.com/java-exercises/basic/java-basic-exercise-2.php

public class Exercise2 {
 
 public static void main(String[] args) {
  System.out.println(24+26);
 }
 
}

import java.util.Scanner;

public class Main {
  public static void main(String[] args) 
  {
    Scanner input = new Scanner (System.in);
    System.out.print("Input the first number: ");
    int num1 = input.nextInt();
    System.out.print("Input the second number: ");
    int num2 = input.nextInt();
    int sum = num1 + num2;
    System.out.println();
    System.out.println("Sum: "+sum);
  }
}
 */

import java.util.Scanner;

public class Print_Sum {

	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Input the first number: \n");
		int num1 = input.nextInt();
		
		
		System.out.print("Input the second number: \n");
		
		int num2 = input.nextInt();
		int sum = num1 + num2;
		System.out.println();
        System.out.println("sum is "+ sum);
		

	}

}
