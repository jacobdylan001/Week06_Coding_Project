package CardGame;

import java.util.ArrayList;
import java.util.List;

public class Player {

//      Creating private variables for hand, score, and name.

    private List<Card> hand = new ArrayList<>();
    private int score = 0;
    private String name;

//      Creating method to name the player.

    public Player(String name) {
        this.name = name;
    }

//      Creating method to remove the first card from the deck.

    public Card flip() {
        return hand.removeFirst();
    }

//      Creating method to add a drawn card to players hand.

    public void draw(Deck deck) {
        hand.add(deck.draw());
    }

//      Creating method to increment the score.

    public void incrementScore() {
        score++;
    }

//      Creating getters for score and name.

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
}

