package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	   if (a.length() > 1)
	   {
		   String end = (a.substring(a.length()-1)).toUpperCase();
		   String start = (a.substring(0, 1)).toUpperCase();
		   
		   if ((end == "A") || (end == "E") || (end == "I") || (end == "O") || (end == "U")) {
			   	return "yes";
		   }
	   }
	   
	   return "add code here";
	}
}