package Day7;

public class GamblingSimulator {

    public static void main(String[] args) {

        // UC4
        int days = 20;
        int totalAmount = 0;

        for (int day = 1; day <= days; day++) {

            // UC1
            int stake = 100;
            int bet = 1;

            // UC3 (includes UC2 logic)
            while (stake > 50 && stake < 150) {
                if (Math.random() < 0.5) {
                    stake = stake - bet;
                } else {
                    stake = stake + bet;
                }
            }

            // UC4: calculate win/loss for the day
            totalAmount = totalAmount + (stake - 100);
        }

    }
}
