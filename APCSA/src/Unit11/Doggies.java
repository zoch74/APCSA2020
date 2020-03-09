package Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new array of Dog
		pups = new Dog[size];
		
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds
		if (spot < pups.length)
		pups[spot] = new Dog(age, name);
		
	}

	public String getNameOfOldest()
	{
		int oldInd = 0;
		for (int i = 0; i < pups.length; i++) {
			if (i != pups.length-1) {
				if(pups[i].getAge() > pups[i+1].getAge()) {
					oldInd = i;
				}
			}

		}
		if (pups[oldInd].getAge() < pups[pups.length-1].getAge()) {
			oldInd = pups.length-1;
		}
		
		return pups[oldInd].getName();
	}

	public String getNameOfYoungest()
	{
		int youngInd = 0;
		for (int i = 0; i < pups.length; i++) {
			if (i != pups.length-1) {
				if(pups[i].getAge() < pups[i+1].getAge()) {
					youngInd = i;
				}
			}

		}
		if (pups[youngInd].getAge() > pups[pups.length-1].getAge()) {
			youngInd = pups.length-1;
		}
		return pups[youngInd].getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}