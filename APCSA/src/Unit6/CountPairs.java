package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

//import static java.lang.System.*;

public class CountPairs
{
	public static int pairCounter( String str )
	{ 
		if (str.length()>1) {
			int count = 0;
			
			for (int i = 0; i < str.length()-1; i++)
			{
				if ((str.charAt(i) + "").equals((str.charAt(i+1) + ""))) {
					count++;
					
				}
				else {
					continue;
				}
			}
			
			return count;
		}
		else {
			return 0;
		}
	}
}