package Day7;

public class GamblingSimulator {

    public static void main(String[] args) {

        int days = 20;
        int totalAmount = 0;

        int winDays = 0;
        int lossDays = 0;
        int totalWinAmount = 0;
        int totalLossAmount = 0;

        int luckiestDay = -1;
        int unluckiestDay = -1;

        for (int day = 1; day <= days; day++) {

            int stake = 100;
            int bet = 1;

            while (stake > 50 && stake < 150) {
                if (Math.random() < 0.5) {
                    stake = stake - bet;
                } else {
                    stake = stake + bet;
                }
            }

            int dailyResult = stake - 100;
            totalAmount += dailyResult;

            if (dailyResult > 0) {
                winDays++;
                totalWinAmount += dailyResult;

                if (luckiestDay == -1) {
                    luckiestDay = day;
                }
            } else {
                lossDays++;
                totalLossAmount += Math.abs(dailyResult);

                if (unluckiestDay == -1) {
                    unluckiestDay = day;
                }
            }
        }

    }
}
