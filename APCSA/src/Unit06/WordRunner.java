package Unit06;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

//import static java.lang.System.*;

public class WordRunner
{
	public static void main ( String[] args )
	{
		Word test1 = new Word("Hello");
		System.out.println(test1.toString());
		
		Word test2 = new Word("World");
		System.out.println(test2.toString());
		
		Word test3 = new Word("Jukebox");
		System.out.println(test3.toString());
		
		Word test4 = new Word("TCEA");
		System.out.println(test4.toString());
		
		Word test5 = new Word("UIL");
		System.out.println(test5.toString());
	}
}