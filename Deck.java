package CardGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

//      Creating a private list of cards.

    private List<Card> cards = new ArrayList<>();

//      Creating the deck and filling it with the numbers and suits of all cards.

    public Deck() {
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
                "Jack", "Queen", "King", "Ace"};

//      Loops through each array to create the full deck of 52 cards.

        for (String suit : suits) {
            for (int i = 0; i < numbers.length; i++) {
                cards.add(new Card(i + 2, numbers[i] + " of " + suit));

            }

        }
    }

//      Creating method to shuffle the deck of cards.

    public void shuffle() {
        Collections.shuffle(this.cards);
    }

//      Creating method to remove the first card from the shuffled deck.

    public Card draw() {

        return this.cards.removeFirst();

    }
}

