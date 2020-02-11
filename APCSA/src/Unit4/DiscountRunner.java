package Unit4;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

//import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the original bill amount :: ");
		double amt1 = keyboard.nextDouble();
		
		System.out.println("Bill after discount :: " + String.format("%.2f\n", Discount.getDiscountedBill(amt1)));
		
		System.out.println("Enter the original bill amount :: ");
		double amt2 = keyboard.nextDouble();
		
		System.out.println("Bill after discount :: " + String.format("%.2f\n", Discount.getDiscountedBill(amt2)));
		
		System.out.println("Enter the original bill amount :: ");
		double amt3 = keyboard.nextDouble();
		
		System.out.println("Bill after discount :: " + String.format("%.2f\n", Discount.getDiscountedBill(amt3)));
		
		System.out.println("Enter the original bill amount :: ");
		double amt4 = keyboard.nextDouble();
		
		System.out.println("Bill after discount :: " + String.format("%.2f\n", Discount.getDiscountedBill(amt4)));
		
		System.out.println("Enter the original bill amount :: ");
		double amt5 = keyboard.nextDouble();
		
		System.out.println("Bill after discount :: " + String.format("%.2f\n", Discount.getDiscountedBill(amt5)));
		
		keyboard.close();
		
		
	}
}