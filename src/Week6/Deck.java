package Week6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
// Fields
	List<Card> cards = new ArrayList<>();
	
	Deck() {
	String[] numbers = {"2", "3","4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
	String[] suits = {"Hearts", "Clubs", "Spades", "Diamonds"};
	
	for (String suit : suits) {
		int count = 2;
		for (String number : numbers) {
			Card card = new Card(number + " of " + suit, count);
			cards.add(card);
			count++;
		}
	}
}
	
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		Card card = cards.remove(0);
		return card;
		
	}
}
