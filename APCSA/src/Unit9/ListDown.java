package Unit9;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(List<Integer> numArray)
	{
		boolean dec = true;
		for (int i = 0; i < numArray.size(); i++) {
			if (i < numArray.size()-1) {
				if (numArray.get(i) <= numArray.get(i+1)) {
					dec = false;
				}
			}
			
		}
		return dec;
	}	
}