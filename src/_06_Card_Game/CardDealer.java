package _06_Card_Game;

import java.util.ArrayList;
import java.util.Random;

import _06_Card_Game.Card.Suit;

public class CardDealer {
    
    ArrayList<Card> deck;
    
    public void createDeck() {
    	for (int i = 0; i < 52; i++) {
			for (int j = 0; j < 52; j++) {
				deck.add(getSuit(), getRank());
			}
		}
    }

}
