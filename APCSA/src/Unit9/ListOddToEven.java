package Unit9;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int dist = 0;
		int i = 0;
		int oddInd = 0;
		int evenInd = 0;
		
		ArrayList<Integer> temp = new ArrayList<Integer>();
		
		for (int num : ray) {
			temp.add(Math.abs(num));
		}
		
		
		while (i < temp.size() && ((temp.get(i) % 2) == 0)) {
			i++;
		}
		oddInd = i;
		//System.out.println("odd: " + oddInd);
		if (oddInd == temp.size()) {
			dist = -1;
		}
		else {
			int j = temp.size()-1;
			while (j >= oddInd && ((temp.get(j) % 2) == 1)) {
				j--;
			}
			evenInd = j;
			//System.out.println("even:" + evenInd);
			if (j == temp.size()) {
				dist = -1;
			}
			else {
				//System.out.println("even: "+ evenInd + " odd: "+ oddInd);
				dist = evenInd - oddInd;
			}
			
		}
		
		
		
		return dist;
	}
}