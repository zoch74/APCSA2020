package Unit08;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
	public static int go(int[] ray)
	{
		int sum = 0;
		boolean grtThan = false;
		int lastVal = ray[ray.length-1];
		for (int i = 0; i < ray.length; i++) {
			if (ray[i] > lastVal) {
				sum = sum + ray[i];
				grtThan = true;
			}
		}
		if (grtThan == false) {
			sum = -1;
		}
		
		return sum;
	}
}