package Day7;

public class GamblingSimulator {

    public static void main(String[] args) {

        // UC1
        int stake = 100;
        int bet = 1;

        // UC3 (UC2 logic repeated inside loop)
        while (stake > 50 && stake < 150) {

            if (Math.random() < 0.5) {
                stake = stake - bet;
            } else {
                stake = stake + bet;
            }
        }

    }
}
