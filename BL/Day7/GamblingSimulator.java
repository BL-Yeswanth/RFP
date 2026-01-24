package Day7;

public class GamblingSimulator {

    public static void main(String[] args) {

        // UC1
        int stake = 100;
        int bet = 1;

        // UC2
        double random = Math.random();

        if (random < 0.5) {
            stake = stake - bet;
        } else {
            stake = stake + bet;
        }

    }
}
