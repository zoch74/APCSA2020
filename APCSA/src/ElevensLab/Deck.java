package ElevensLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


//make a Deck class
public class Deck{
	
	
	
	public static final int NUMCARDS = 52;
	public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");
	
	private List<Card> cards;
	private int top;

   //make a Deck constructor
	public Deck() {
		cards = new ArrayList<Card>();
		top = 51;
		
		for(String suit : SUITS){
			for (int i = 1; i <= 13; i++) {
				cards.add(new Card(suit, i));
			}
		}
		
	}
	
	public Card dealCard() {
		
		int tempTop = top;
		top--;
		return cards.get(tempTop);
		
	}
   //make a dealCard() method that returns the top card
   
	public void shuffle() {
		List<Card> temp = new ArrayList<Card>();
		for (int i = 0; i < cards.size(); i++) {
			temp.add(cards.get(i));
		}
		List<Card> shuffle = new ArrayList<Card>();
		
		Random rand = new Random();
		int tempRand = 0;
		for (int i = 1; i < 52; i++) {
			tempRand = rand.nextInt(52-i);
			shuffle.add(temp.get(tempRand));
			temp.remove(tempRand);
			
		}
		shuffle.add(temp.get(0));
		
		top = 51;
		for (int i = 0; i <52; i++) {
			cards.set(i, shuffle.get(i));
		}
	}
	
   //write a shuffle() method
   	//use Colletions.shuffle
   	//reset the top card 
	
	
	
}

	
