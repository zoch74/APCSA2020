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
		String cleaned = sentence;
		int loc = cleaned.indexOf(lookFor);

		while (loc != -1) {
			String start = cleaned.substring(0,loc);
			String end = cleaned.substring(loc +1);
			cleaned = start + end;
			loc = cleaned.indexOf(lookFor);
		}
		
		return cleaned;
	}

	public String toString()
	{
		return removeLetters() + " - letter to remove " + lookFor;
	}
}