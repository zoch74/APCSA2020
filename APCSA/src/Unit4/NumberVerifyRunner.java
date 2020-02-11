package Unit4;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

//import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		//add in input
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a whole number :: ");
		int num1 = keyboard.nextInt();
		
		System.out.println(num1 + " is odd :: " + NumberVerify.isOdd(num1));
		System.out.println(num1 + " is even :: " + NumberVerify.isEven(num1) + "\n");
		
		System.out.println("Enter a whole number :: ");
		int num2 = keyboard.nextInt();
		
		System.out.println(num2 + " is odd :: " + NumberVerify.isOdd(num2));
		System.out.println(num2 + " is even :: " + NumberVerify.isEven(num2) + "\n");
		
		System.out.println("Enter a whole number :: ");
		int num3 = keyboard.nextInt();
		
		System.out.println(num3 + " is odd :: " + NumberVerify.isOdd(num3));
		System.out.println(num3 + " is even :: " + NumberVerify.isEven(num3) + "\n");
		
		System.out.println("Enter a whole number :: ");
		int num4 = keyboard.nextInt();
		
		System.out.println(num4 + " is odd :: " + NumberVerify.isOdd(num4));
		System.out.println(num4 + " is even :: " + NumberVerify.isEven(num4) + "\n");
		
		System.out.println("Enter a whole number :: ");
		int num5 = keyboard.nextInt();
		
		System.out.println(num5 + " is odd :: " + NumberVerify.isOdd(num5));
		System.out.println(num5 + " is even :: " + NumberVerify.isEven(num5) + "\n");
		
		//add in more test cases
		
		keyboard.close();
	}
}