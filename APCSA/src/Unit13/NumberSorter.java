package Unit13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		int mult = 1;
		do {
			if (number % mult != number) {
				count++;
				mult = mult * 10;
			}
		} while (number % mult != number);
		
		
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int size = getNumDigits(number);
		int[] sorted = new int[size];
		
		int redNum = number;
		int indNum = 0;
		int mult = 10;
		
		for (int i = 1; i < size+1; i++) {
			indNum = (redNum / ((int)Math.pow(mult, (size -i))));
			sorted[i-1] = indNum;
			redNum = redNum % ((int)Math.pow(mult, (size -i)));
		}
		
		int temp = 0;
		for (int i =0; i<size; i++) {
			do {
				
			}
			
			
			if(sorted[i]>sorted[i+1]) {
				temp = sorted[i];
				sorted[i] = sorted[i+1];
				sorted[i+1] = temp;
			}
			if(sorted[i-1]>sorted[i]) {
				temp = sorted[i-1];
				sorted[i-1] = sorted[i];
				sorted[i] = temp;
			}
		}
		
		
		
		return sorted;
	}
}