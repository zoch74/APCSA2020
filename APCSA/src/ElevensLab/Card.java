package ElevensLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Card
{
	//name of card
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};
	private String rank;

	//instance variables
		//String suit
	private String suit;
	private static final String SUIT[] = {"HEARTS", "DIAMONDS", "CLUBS", "SPADES"};
	
		//int face index
	private int cardIndex;
	public static final int cardNum[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13};
	
	//value of card
	private int val;
	public static final int cardVal[] = {0,1,2,3,4,5,6,7,8,9,10,10,10,10};
	
	
	

  	//constructors
	public Card() {
		setSuit("");
		setRank("");
		setPoint(0);
	}
	public Card(String r, String s, int v) {
		setSuit(s);
		setRank(r);
		setPoint(v);
	}
// modifiers
	private void setPoint(int v) {
		val = v;
		
	}
	public void setSuit(String s) {
		suit = s.toUpperCase();
	}
	
	public void setRank(String s) {
		rank = s.toUpperCase();
	}

  	//accessors
		//get methods
	public String suit() {
		return suit;
	}
	public String rank() {
		
		return rank;
	}
	public int pointValue() {
		return val;
	}
	
	public boolean matches(Card otherCard) {
		if (otherCard.suit().equals(this.suit()) && otherCard.rank().equals(this.rank()) && otherCard.pointValue() == this.pointValue()) {
			return true;
		}
		else {
			return false;	
		}
		
	}


  	//toString
	public String toString() {
		return rank() + " of " + suit() + " (point value = " + val + ")";
	}
	
	

 }