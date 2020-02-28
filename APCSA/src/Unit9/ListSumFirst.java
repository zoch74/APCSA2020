package Unit9;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go(List<Integer> ray)
	{
		int sum = 0;
		boolean grtThan = false;
		int firstVal = ray.get(0);
		for (int i = 0; i < ray.size(); i++) {
			if (ray.get(i) > firstVal) {
				sum = sum + ray.get(i);
				grtThan = true;
			}
		}
		if (grtThan == false || ray.size()==0) {
			sum = -1;
		}
		
		return sum;
	}
}