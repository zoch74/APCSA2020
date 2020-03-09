package Unit03;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
//import static java.lang.Math.*;

public class DistanceRunner
{
	
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);
		
		int i = 0;
		while (i < 3)
		{
			out.print("Enter x1 :: ");
			int x1 = keyboard.nextInt();
	
			out.print("Enter y1 :: ");
			int y1 = keyboard.nextInt();
	
			out.print("x2 :: ");
			int x2 = keyboard.nextInt();
			
			out.print("y2 :: ");
			int y2 = keyboard.nextInt();
	
			Distance test = new Distance(x1, y1, x2, y2);
			test.calcDistance();
			test.print();
			
			i++;
		}
		
		//add test cases	
		
		keyboard.close();
			
	}
}