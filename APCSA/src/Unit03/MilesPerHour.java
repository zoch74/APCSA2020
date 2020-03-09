package Unit03;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

//import java.util.Scanner; 
//import static java.lang.System.*;
//import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph = 0.0;
		
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		setNums(dist, hrs, mins);
		
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void calcMPH()
	{
		double time = hours + ((double) minutes/60);
		mph = Math.round(distance/time);
		
	}

	public void print()
	{
		System.out.println(distance + " miles in " + hours + " hours and " + minutes + " minutes = " + (int)mph + " MPH.\n\n");
	}
	
	//create a print or toString or both
	
	/*public String toString()
	{
		return ;
	}*/
}