package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

//import static java.lang.System.*;

public class StringEquality
{
	private String wordOne, wordTwo;
	private Boolean same;

	public StringEquality()
	{
		setWords("", "");
		same = false;
	}

	public StringEquality(String one, String two)
	{
		setWords(one, two);
		same = false;
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public boolean checkEquality( )
	{
		if (wordOne.equals(wordTwo)) {
			same = true;
		}
		else {
			same = false;
		}
		return same;
	}

	public String toString()
	{
		if (same == true) {
			return wordOne + " has the same letters as " + wordTwo + "\n";
		}
		else {
			return wordOne + " does not have the same letters as " + wordTwo + "\n";
		}
	}
}