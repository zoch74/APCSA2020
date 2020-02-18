package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

//import static java.lang.System.*;

public class Perfect
{
   private int number;

   public Perfect() {
	   number = 0;
   }
   public Perfect(int n) {
	   setNum(n);
   }
   public void setNum(int n) {
	   number = n;
   }
	public boolean isPerfect()
	{
		//boolean perf = false;
		int div = 1;
		int sum = 0;
		do {
			if (number % div == 0) {
				sum = sum + div;
			}
			div++;
			
		} while (div < number);
		
		if (sum == number) {
			return true;
		}
		else {
			return false;
		}
	}

	public String toString() {
		
		if (isPerfect() == true) {
			return number + " is perfect.";
		}
		else {
			return number + " is not perfect.";
		}
	}
	
}