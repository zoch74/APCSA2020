package Unit06;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

//import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover test1 = new LetterRemover("I am Sam I am", 'a');
		test1.removeLetters();
		System.out.println(test1.toString() + "\n");	
		
		LetterRemover test2 = new LetterRemover("ssssssssxssssesssssesss", 's');
		test2.removeLetters();
		System.out.println(test2.toString() + "\n");
		
		LetterRemover test3 = new LetterRemover("qwertyqwertyqwerty", 'a');
		test3.removeLetters();
		System.out.println(test3.toString() + "\n");
		
		LetterRemover test4 = new LetterRemover("abababababa", 'b');
		test4.removeLetters();
		System.out.println(test4.toString() + "\n");
		
		LetterRemover test5 = new LetterRemover("abaababababa", 'x');
		test5.removeLetters();
		System.out.println(test5.toString());
											
	}
}