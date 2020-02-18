package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

//import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		setRemover("", ' ');
	}

	public LetterRemover(String s, char rem) {
		setRemover(s, rem);
	}
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		
		int loc = sentence.indexOf(lookFor);
		
		while (loc != -1) {
			String start = sentence.substring(0,loc);
			String end = sentence.substring(loc +1);
			sentence = start + end;
			loc = sentence.indexOf(lookFor);
		}
		
		String cleaned = sentence;
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor;
	}
}