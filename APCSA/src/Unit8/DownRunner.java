package Unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[] )
	{	
		int[] test = {-99,1,2,3,4,5,6,7,8,9,10,12345};
		System.out.println(RayDown.go(test));
		
		int[] test1 = {10,9,8,7,6,5,4,3,2,1,-99};
		System.out.println(RayDown.go(test1));
		
		int[] test2 = {10,20,30,40,50,-11818,40,30,20,10};
		System.out.println(RayDown.go(test2));
		
		int[] test3 = {32767};
		System.out.println(RayDown.go(test3));
		
		int[] test4 = {255,255};
		System.out.println(RayDown.go(test4));
		
		int[] test5 = {9,10,-88,100,-555,1000};
		System.out.println(RayDown.go(test5));
		
		int[] test6 = {10,10,10,11,456};
		System.out.println(RayDown.go(test6));
		
		int[] test7 = {-111,1,2,3,9,11,20,30};
		System.out.println(RayDown.go(test7));
		
		int[] test8 = {9,8,7,6,5,4,3,2,0,-2,-989};
		System.out.println(RayDown.go(test8));
		
		int[] test9 = {12,15,18,21,23,1000};
		System.out.println(RayDown.go(test9));
		
		int[] test10 = {250,19,17,15,13,11,10,9,6,3,2,1,-455};
		System.out.println(RayDown.go(test10));
		
		int[] test11 = {9,10,-8,10000,-5000,1000};
		System.out.println(RayDown.go(test11));
		
	}
}