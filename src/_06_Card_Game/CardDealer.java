package _06_Card_Game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import _06_Card_Game.Card.Rank;
import _06_Card_Game.Card.Suit;

public class CardDealer {

	ArrayList<Card> deck;
	Card cardNum;

	public void createDeck() {
		for (Rank rank : Card.Rank.values()) {
			for (Suit suit : Card.Suit.values()) {
				Card crd = new Card(rank, suit);
				deck.add(crd);
			}
		}
	}

	public void shuffle() {
		Collections.shuffle(deck, new Random(52));
	}
}
