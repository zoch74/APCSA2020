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
		   
		   if ((end.equals("A")) || (end.equals("E")) || (end.equals("I")) || (end.equals("O")) || (end.equals("U"))) {
			   return "yes";  
		   }
		   else if ((start.equals("A")) || (start.equals("E")) || (start.equals("I")) || (start.equals("O")) || (start.equals("U"))) {
			   return "yes";
		   }
		   else {
			   return "no";
		   }
	   }
	   else if (a.length() == 1) {
		   
		   String b = a.toUpperCase();
		   
		   if ((b.equals("A")) || (b.equals("E")) || (b.equals("I")) || (b.equals("O")) || (b.equals("U"))) {
			   return "yes";
		   }
		   else {
			   return "no";
		   }
	   }
	   else {
		   return "no";
	   }
	}
}