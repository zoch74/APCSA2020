package Unit13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;
	

	public WordSortTwo(String sentence)
	{
		private ArrayList<String> temp = new ArrayList<String>();
		int loc = sentence.indexOf(" ");
		String word_saved = "";
		String word = "";
		do {
			if (loc == -1) {
				  word = sentence;
			  }
			  else {
				  word = sentence.substring(0, loc);
			  }
			  if (getPunctuation(word) != "") {
				  word = word.substring(0,word.length()-1);
			  }
			  temp.add(word);
			  
			  word_saved = word;
			  sentence = sentence.substring(loc+1);
			  loc = sentence.indexOf(" ");
		} while (!(word_saved.contentEquals(word)));
		
		wordRay = new String[temp.size()];
		for (int i = 0; i < temp.size(); i++) {
			wordRay[i] = temp.get(i);
		}
	}
	public static String getPunctuation( String word )
	  { 
	    String punc = "";
	    for(int i=word.length()-1; i >= 0; i--){
	      if(!Character.isLetterOrDigit(word.charAt(i))){
	        punc = punc + word.charAt(i);
	      } else {
	        return punc;
	      }
	    }
	    return punc;
	  }

	public void sort()
	{
		
	}

	public String toString()
	{
		String output="";
		return output+"\n\n";
	}
}