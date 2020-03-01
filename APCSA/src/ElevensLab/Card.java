package ElevensLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Card
{
	//name of card
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};
	private String name;

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
		setFace(0);
	}
	public Card(String s, int n) {
		setSuit(s);
		setFace(n);
	}

	// modifiers
		//set methods
	public void setSuit(String s) {
		suit = s.toUpperCase();
	}
	
	public void setFace(int n) {
		cardIndex = n;
		name = FACES[n];
		val = cardVal[n];
	}

  	//accessors
		//get methods
	public String getSuit() {
		return suit;
	}
	public String getFace() {
		
		return name;
	}
	public int getVal() {
		return val;
	}
	public int getIndex() {
		return cardIndex;
	}


  	//toString
	public String toString() {
		return getFace() + " of " + getSuit();
	}

 }