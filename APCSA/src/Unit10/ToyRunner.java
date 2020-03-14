package Unit10;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.Scanner;

public class ToyRunner
{
	
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String resp = "";
		
		do {
			out.print("What is the name of the toy? ");
			String toyName = keyboard.next();
			Toy toy1 = new Toy(toyName);
			
			System.out.println(toy1);
			
			out.print("Do you want to add another toy? ");
			 resp = keyboard.next();
			
		} while (resp.equals("y") || resp.equals("Y"));
		
		
	}
}