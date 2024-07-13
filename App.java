package CardGame;

public class App {
    public static void main(String[] args) {

//         Instantiating a new deck with two new players.

        Deck deck = new Deck();
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

//          Calling the shuffle method.

        deck.shuffle();

//          Distributing the cards evenly to both players.

        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                player1.draw(deck);
            } else {
                player2.draw(deck);
            }
        }
//          As long as the index is less than half the deck (26) the game will continue.

        for (int i = 0; i < 26; i++) {
            Card player1Card = player1.flip();
            Card player2Card = player2.flip();

            System.out.println("---------------------");

            System.out.println(player1.getName() + " flips ");
            player1Card.describe();

            System.out.println(player2.getName() + " flips ");
            player2Card.describe();

            if (player1Card.getValue() > player2Card.getValue()) {
                player1.incrementScore();
                System.out.println(player1.getName() + " won the round!");
            } else if (player2Card.getValue() > player1Card.getValue()) {
                player2.incrementScore();
                System.out.println(player2.getName() + " won the round!");
            } else {
                System.out.println("It's a tie!");
            }
        }
            System.out.println("---------------------");

//          At the end of the game the final scores print to the console.

        System.out.println("Final Scores:");
        System.out.println(player1.getName() + ": " + player1.getScore());
        System.out.println(player2.getName() + ": " + player2.getScore());

//          Finds out who the winner is based on the value of each player's score.

        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " wins!");
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println(player2.getName() + " wins!");
        } else {
            System.out.println("It's a draw!");
                }
            }
        }

