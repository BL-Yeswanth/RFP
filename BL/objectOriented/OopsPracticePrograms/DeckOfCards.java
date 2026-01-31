package objectOriented.OopsPracticePrograms;

import java.util.Random;

/**
 * DeckOfCards
 *
 * Program to initialize a deck of cards, shuffle them,
 * distribute 9 cards to 4 players, and display the result.
 */
public class DeckOfCards {

    public static void main(String[] args) {

        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"
        };

        // Create deck of 52 cards
        String[] deck = new String[52];
        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }

        // Shuffle the deck using Random
        shuffleDeck(deck);

        // 2D array to store 4 players and 9 cards each
        String[][] players = new String[4][9];

        int cardIndex = 0;
        for (int player = 0; player < 4; player++) {
            for (int card = 0; card < 9; card++) {
                players[player][card] = deck[cardIndex++];
            }
        }

        // Print cards for each player
        printPlayersCards(players);
    }

    /**
     * Shuffles the deck using Random.
     *
     * @param deck array of cards
     */
    private static void shuffleDeck(String[] deck) {

        Random random = new Random();

        for (int i = 0; i < deck.length; i++) {
            int randomIndex = random.nextInt(deck.length);

            // Swap cards
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }

    /**
     * Prints cards received by each player.
     *
     * @param players 2D array of players and their cards
     */
    private static void printPlayersCards(String[][] players) {

        for (int i = 0; i < players.length; i++) {
            System.out.println("\nPlayer " + (i + 1) + " cards:");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println(players[i][j]);
            }
        }
    }
}
