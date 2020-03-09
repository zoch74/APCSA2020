package Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static void printTriangle(String word)
	{
		int num = word.length();
		String line = "";
		String phrase = "";
		for (int i = 0; i <= word.length(); i++) {
			phrase = word.substring(0,i);
			for (int j = 0; j < i; j++) {
				line = line + phrase;
			}
			System.out.println(line);
			line = "";
		}
	}
}