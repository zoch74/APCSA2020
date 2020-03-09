package Unit07;
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
	public String toString() {
		
		int aTemp, bTemp, cTemp;
		double aSquare, bSquare; 
		String output = "";
		
		for (int n = 1; n < number; n++) {
			aTemp = n;
			for (int m = n+1; m < number; m=m+2) {
				bTemp = m;
				aSquare = Math.pow(aTemp, 2);
				bSquare = Math.pow(bTemp, 2);
				cTemp = (int)Math.sqrt(aSquare + bSquare);
				if (Math.sqrt(aSquare + bSquare) == Math.round(Math.sqrt(aSquare + bSquare))) {
					if (greatestCommonFactor(aTemp, bTemp, cTemp) == 1) {
						if (cTemp % 2 == 1) {
							if (aTemp < number && bTemp < number && cTemp < number) {
								output = output + aTemp + " " + bTemp + " " + cTemp + "\n";
							}
						}
					}
				}
			}
		}
		
		
		
		
		
		
		
		return output;
	}
}