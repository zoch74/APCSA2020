package Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	int numerator, denominator;

	//write two constructors
	public Rational() {
		setNum(1);
		setDenom(1);
	}
	
	public Rational(int num, int den) {
		setNum(num);
		setDenom(den);
	}


	//write a setRational method
	public void setRational(int num, int den) {
		this.setNum(num);
		this.setDenom(den);
	}
	

	//write  a set method for numerator and denominator
	public void setNum(int num) {
		numerator = num;
	}
	
	public void setDenom(int den) {
		denominator = den;
	}

	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		// this = 1; other = 2
		
		numerator = ((this.getNum() * other.getDenom()) + (other.getNum() * this.getDenom()));
		denominator = (this.getDenom() * other.getDenom());

		reduce();
	}

	private void reduce()
	{
		int div = gcd(numerator, denominator);
		numerator = numerator/div;
		denominator = denominator/div;

	}

	private int gcd(int numOne, int numTwo)
	{
		int min = Math.min(numOne, numTwo);
		for (int x = min; x > 1; x--) {
			if (numOne % x == 0 && numTwo % x == 0) {
				return x;
			}
		}
		
		return 1;
	}

	public Object clone ()
	{
		return (Object)this;
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	
	public int getNum() {
		return numerator;
	}
	
	public int getDenom() {
		return denominator;
	}
	
	
	public boolean equals( Object obj)
	{
		this.reduce();
		((Rational) obj).reduce();
		int num1 = this.getNum();
		int den1 = this.getDenom();
		int num2 = ((Rational) obj).getNum();
		int den2 = ((Rational) obj).getDenom();
		
		if (num1 == num2 && den1 == den2) {
			return true;
		}
		else {
			return false;
		}

	}

	public int compareTo(Rational other)
	{
		this.reduce();
		other.reduce();
		double resultThis = (double)this.getNum()/this.getDenom();
		double resultOther = (double)other.getNum()/other.getDenom();
		if (resultThis > resultOther) {
			return 1;
		}
		else if (resultThis == resultOther){
			return 0;
		}
		else {
			return -1;
		}
		
	}



	
	//write  toString() method
	public String toString() {
		return numerator + "/" + denominator;
	}
	
	
}