package Unit7;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFiveRunner
{
   public static void main(String args[])
   {
	   TriangleFive test = new TriangleFive('C', 4);
	   System.out.println(test.toString());
	   
	   TriangleFive test1 = new TriangleFive('A', 5);
	   System.out.println(test1.toString());
	   
	   TriangleFive test2 = new TriangleFive('B', 7);
	   System.out.println(test2.toString());
	   
	   TriangleFive test3 = new TriangleFive('X', 6);
	   System.out.println(test3.toString());
	   
	   TriangleFive test4 = new TriangleFive('Z', 8);
	   System.out.println(test4.toString());
	}
}