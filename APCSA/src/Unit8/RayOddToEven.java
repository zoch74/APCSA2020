package Unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int dist = 0;
		int i = 0;
		int oddInd = 0;
		int evenInd = 0;
		while (i < ray.length && ((ray[i] % 2) == 0)) {
			i++;
		}
		oddInd = i;
		if (oddInd == ray.length) {
			dist = -1;
		}
		else {
			int j = oddInd;
			while (j < ray.length && ((ray[j] % 2) == 1)) {
				j++;
			}
			evenInd = j;
			if (j == ray.length) {
				dist = -1;
			}
			else {
				dist = evenInd - oddInd;
			}
			
		}
		
		
		
		return dist;
	}
}