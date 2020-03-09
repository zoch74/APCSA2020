package Unit05;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

//import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		StringEquality test1 = new StringEquality("hello", "goodbye");
		test1.checkEquality();
		System.out.println(test1.toString());
		
		StringEquality test2 = new StringEquality("one", "two");
		test2.checkEquality();
		System.out.println(test2.toString());
		
		StringEquality test3 = new StringEquality("three", "four");
		test3.checkEquality();
		System.out.println(test3.toString());
		
		StringEquality test4 = new StringEquality("TCEA", "UIL");
		test4.checkEquality();
		System.out.println(test4.toString());
		
		StringEquality test5 = new StringEquality("State", "Champions");
		test5.checkEquality();
		System.out.println(test5.toString());
		
		StringEquality test6 = new StringEquality("ABC", "ABC");
		test6.checkEquality();
		System.out.println(test6.toString());
		
		StringEquality test7 = new StringEquality("ABC", "CBA");
		test7.checkEquality();
		System.out.println(test7.toString());
		
		StringEquality test8 = new StringEquality("Same", "Same");
		test8.checkEquality();
		System.out.println(test8.toString());
	}
}