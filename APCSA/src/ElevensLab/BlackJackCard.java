package ElevensLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class BlackJackCard extends Card
{
  	//constructors
  	public BlackJackCard( String s, int f)
  	{
  		super( s, f );
  	}

  	//accessors
	public int getValue()
	{
		if( getIndex() == 1 )
			return 11;
		if( getIndex() >= 10 )
			return 10;
		return getIndex();
	}

  	//toString
  	public String toString()
  	{
  		return super.toString() + " " + getValue();
  	}
 }