package objectOriented.OopsPracticePrograms;

import java.util.Random;

/**
 * DeckOfCardsWithPlayers
 *
 * Extends Deck of Cards program by:
 * - Creating Player objects
 * - Assigning cards to each player
 * - Sorting cards by rank
 * - Maintaining cards in Queue (Linked List)
 * - Arranging Players in Queue
 */
public class DeckOfCardsWithPlayers {

    // -------------------- NODE CLASS --------------------
    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // -------------------- QUEUE USING LINKED LIST --------------------
    static class Queue {
        Node front, rear;

        void enqueue(String data) {
            Node newNode = new Node(data);

            if (rear == null) {
                front = rear = newNode;
                return;
            }

            rear.next = newNode;
            rear = newNode;
        }

        void display() {
            Node temp = front;
            while (temp != null) {
                System.out.println("  " + temp.data);
                temp = temp.next;
            }
        }
    }

    // -------------------- PLAYER CLASS --------------------
    static class Player {
        String name;
        Queue cards = new Queue();

        Player(String name) {
            this.name = name;
        }
    }

    // -------------------- PLAYER QUEUE --------------------
    static class PlayerQueue {
        PlayerNode front, rear;

        static class PlayerNode {
            Player player;
            PlayerNode next;

            PlayerNode(Player player) {
                this.player = player;
            }
        }

        void enqueue(Player player) {
            PlayerNode node = new PlayerNode(player);

            if (rear == null) {
                front = rear = node;
                return;
            }

            rear.next = node;
            rear = node;
        }

        void displayPlayers() {
            PlayerNode temp = front;
            while (temp != null) {
                System.out.println("\n" + temp.player.name + " cards:");
                temp.player.cards.display();
                temp = temp.next;
            }
        }
    }

    // -------------------- MAIN METHOD --------------------
    public static void main(String[] args) {

        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"
        };

        // Create deck
        String[] deck = new String[52];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }

        shuffle(deck);

        // Create players
        PlayerQueue playerQueue = new PlayerQueue();
        Player[] players = {
                new Player("Player 1"),
                new Player("Player 2"),
                new Player("Player 3"),
                new Player("Player 4")
        };

        for (Player p : players) {
            playerQueue.enqueue(p);
        }

        // Distribute 9 cards to each player
        int cardIndex = 0;
        for (Player player : players) {
            String[] playerCards = new String[9];
            for (int i = 0; i < 9; i++) {
                playerCards[i] = deck[cardIndex++];
            }

            sortByRank(playerCards);

            for (String card : playerCards) {
                player.cards.enqueue(card);
            }
        }

        // Print players and cards
        playerQueue.displayPlayers();
    }

    // -------------------- SHUFFLE --------------------
    private static void shuffle(String[] deck) {
        Random random = new Random();

        for (int i = 0; i < deck.length; i++) {
            int r = random.nextInt(deck.length);
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }
    }

    // -------------------- SORT BY RANK --------------------
    private static void sortByRank(String[] cards) {

        for (int i = 0; i < cards.length - 1; i++) {
            for (int j = i + 1; j < cards.length; j++) {
                if (rankValue(cards[i]) > rankValue(cards[j])) {
                    String temp = cards[i];
                    cards[i] = cards[j];
                    cards[j] = temp;
                }
            }
        }
    }

    private static int rankValue(String card) {

        if (card.startsWith("2")) return 2;
        if (card.startsWith("3")) return 3;
        if (card.startsWith("4")) return 4;
        if (card.startsWith("5")) return 5;
        if (card.startsWith("6")) return 6;
        if (card.startsWith("7")) return 7;
        if (card.startsWith("8")) return 8;
        if (card.startsWith("9")) return 9;
        if (card.startsWith("10")) return 10;
        if (card.startsWith("Jack")) return 11;
        if (card.startsWith("Queen")) return 12;
        if (card.startsWith("King")) return 13;
        return 14; // Ace
    }
}
