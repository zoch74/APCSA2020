package Unit04;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -  
//Class -
//Lab  -

//import static java.lang.System.*;

public class NumberVerify
{
	public static boolean isOdd( int num )
	{
		if (num > 0) {
			if (num % 2 == 1) {
				return true;
			}
			else {
				return false;
			}
		}
		else
		{
			num = num * -1;
			if (num % 2 == 1) {
				return true;
			}
			else {
				return false;
			}
			
		}
		
	}
	public static boolean isEven( int num )
	{
		if (num > 0) {
			if (num % 2 == 1) {
				return false;
			}
			else {
				return true;
			}
		}
		else
		{
			num = num * -1;
			if (num % 2 == 1) {
				return false;
			}
			else {
				return true;
			}
			
		}
	}
}