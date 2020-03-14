package Unit10;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore26
{
	private ArrayList<Toy> toyList;

	public ToyStore26()
	{
		toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		int loc = toys.indexOf(" ");
		  
		  String toys_saved = "";
		  String word = "";
		do {
			  
			  if (loc == -1) {
				  word = toys;
			  }
			  else {
				  word = toys.substring(0, loc);
			  }
			  if (getPunctuation(word) != "") {
				  word = word.substring(0,word.length()-1);
			  }
			  
			  if (toyList.size() == 0) {
				  toyList.add(new Toy(word));
			  }
			  else {
				  int matchInd = -1;
				  for (int i = 0; i < toyList.size(); i++) {
						if (toyList.get(i).getName().equals(word)) {
							matchInd = i;
						}
					}
				  if (matchInd != -1) {
					  toyList.get(matchInd).setCount(toyList.get(matchInd).getCount() + 1);
				  }
				  else {
					  toyList.add(new Toy(word));
				  }
			  }
			  
		
			  
			  //System.out.println(toyList);
			  
			  toys_saved = toys;
			  toys = toys.substring(loc+1);
			  loc = toys.indexOf(" ");
			  
		  } while (!(toys_saved.equals(toys)));
		
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
  
  	public Toy getThatToy( String nm )
  	{
  		for (int i = 0; i < toyList.size(); i++) {
  			if (toyList.get(i).getName().equals(nm)) {
  				return toyList.get(i);
  			}
  		}
  		return null;
  		
  	}
  
  	public String getMostFrequentToy()
  	{
  		int highInd = 0;
  		for (int i = 0; i < toyList.size(); i++) {
  			if (toyList.get(i).getCount() > toyList.get(highInd).getCount()) {
  				highInd = i;
  			}
  			
  		}
  		
  		return toyList.get(highInd).getName();
  	}  
  
  	public void sortToysByCount()
  	{
  		
  		for (int i = 0; i < toyList.size()-1; i++) {
  			if (toyList.get(i).getCount() > toyList.get(i+1).getCount()) {
  				Toy tempToy = toyList.get(i+1);
  				toyList.set(i + 1, toyList.get(i));
  				toyList.set(i, tempToy);
  				
  			}
  		}
  	}  
  	
  	public String myName(){
  		return "Zoë Chan";
  	}
  	  
	public String toString()
	{
	   return toyList + "";
	}
}