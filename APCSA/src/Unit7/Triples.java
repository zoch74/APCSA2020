package Unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		setNum(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;

	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 1;
		int count = 1;
		while (count <= a) {
			if (a%count == 0 && b % count == 0 && c % count == 0) {
				max = count;
			}
			count++;
		}

		return max;
	}

	public String toString()
	{
		String output="";
		int a, b, c, a_temp, b_temp, c_temp;
		int i = 1;
		/*
		while (i <= number) {
			a_temp = i;
			
			b_temp = a_temp +1;
				
			while (b_temp < number && Math.sqrt(Math.pow(a_temp, 2) + Math.pow(b_temp, 2)) % 2 != 1) {
				b_temp = b_temp + 2;
			}
			if ()
			
			c_temp = (int) Math.sqrt(Math.pow(a_temp, 2) + Math.pow(b_temp, 2));
				
				
			
			
		}*/
		
		for (int j = 1; j <= number; j++) {
			a_temp = j;
			for (int k = 2; k <= number; k=k+2) {
				b_temp = j;
				c_temp = (int) Math.sqrt(Math.pow(a_temp, 2) + Math.pow(b_temp, 2));
				
				if ()
			}
			
		}






		return output+"\n";
	}
}