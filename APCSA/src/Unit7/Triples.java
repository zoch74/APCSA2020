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
		this(0);
	}

	public Triples(int num)
	{
		num = 1;
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
		
		while (i <= number) {
			a_temp = number;
			
			if (a_temp % 2 == 1) {
				b_temp = a_temp +1;
				
				while (Math.sqrt(Math.pow(a_temp, 2) + Math.pow(b_temp, 2)) % 2 != 1) {
					b_temp = b_temp + 2;
				}
				
				
			}
		}






		return output+"\n";
	}
}