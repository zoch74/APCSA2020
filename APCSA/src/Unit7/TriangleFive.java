package Unit7;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setLetter(' ');
		setAmount(0);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String line = "";
		String output="";
		int ind = alphabet.indexOf(letter);
		int j = 0;
		//for loop for printing each line
		for (int k = amount; k > 0; k--) {
			j = (amount - k) + ind;
			if (j >= 26) {
				j = j -26;
			}
			for (int z = k; z>0; z--) {
				line = line + alphabet.charAt(j);
			}
			
			line = line + " ";
		}
		line = line + " ";
		int len = line.length();
		int rem = 0;
		
		for (int i = 0; i < amount; i++) {
			rem = rem + i + 1;
			output = output + line.substring(0,len -rem) + "\n";
		}
		
		return output;
	}
}