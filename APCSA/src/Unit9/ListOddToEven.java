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
		while (i < ray.size() && ((ray.get(i) % 2) == 0)) {
			i++;
		}
		oddInd = i;
		//System.out.println("odd: " + oddInd);
		if (oddInd == ray.size()) {
			dist = -1;
		}
		else {
			int j = ray.size()-1;
			while (j >= oddInd && ((ray.get(j) % 2) == 1)) {
				j--;
			}
			evenInd = j;
			//System.out.println("even:" + evenInd);
			if (j == ray.size()) {
				dist = -1;
			}
			else {
				dist = evenInd - oddInd;
			}
			
		}
		
		
		
		return dist;
	}
}