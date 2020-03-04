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
	public static final int cardVal[] = {1,2,3,4,5,6,7,8,9,10,10,10,10};
	public static final String FACES[] = {"ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};
	
	private List<Card> cards;
	private int top, size;

   //make a Deck constructor
	public Deck() {
		cards = new ArrayList<Card>();
		
		for(String suit : SUITS){
			for (int i = 0; i <= 12; i++) {
				cards.add(new Card(suit, FACES[i], cardVal[i]));
			}
		}
		
		resetTop();
		shuffle();
	}
	public Deck(String[] ranks, String[] suits, int[] vals) {
		cards = new ArrayList<Card>();
		resetTop();
		
		for(String suit : suits){
			for (int i = 0; i <= ranks.length-1; i++) {
				cards.add(new Card(ranks[i], suit, vals[i]));
			}
		}
		
		resetTop();	
		shuffle();
	}
	
	public Card deal() {
		
		if (isEmpty()) {
			return null;
		}
		else {
			Card tempTop = cards.get(top);
			top--;
			return tempTop;
		}	
	}
	
	public boolean isEmpty() {
		return size()==0;
	}
	public int size() {
		return top+1;
	}
	public void resetTop() {
		size = cards.size();
		top = size-1;
	}
	
	public String toString() {
		String deckPrint = "";
		for (int i = 0; i <= top; i++) {
			deckPrint = deckPrint + cards.get(i).toString() + ", ";
		}
		return deckPrint;
	}
	
	
   //make a dealCard() method that returns the top card
   
	public void shuffle() {
		
		for (int i = 1; i <4; i++) {
			Shuffler.selectionShuffle(cards);
		}
		
		resetTop();
	}
	
	
   //write a shuffle() method
   	//use Collections.shuffle
   	//reset the top card 
	
	
	
}

	
