package Day4;

public class SnakeAndLadderUC7 {

    private static final int NO_PLAY = 0;
    private static final int LADDER = 1;
    private static final int SNAKE = 2;

    public static void main(String[] args) {

        int player1Position = 0;
        int player2Position = 0;

        int currentPlayer = 1;

        while (player1Position != 100 && player2Position != 100) {

            int dieRoll = (int)(Math.random() * 6) + 1;
            int option = (int)(Math.random() * 3);

            if (currentPlayer == 1) {

                player1Position = movePlayer(player1Position, dieRoll, option);
                System.out.println("Player 1 rolled " + dieRoll +
                        " | Position: " + player1Position);

                if (option != LADDER)
                    currentPlayer = 2;

            } else {

                player2Position = movePlayer(player2Position, dieRoll, option);
                System.out.println("Player 2 rolled " + dieRoll +
                        " | Position: " + player2Position);

                if (option != LADDER)
                    currentPlayer = 1;
            }
        }

        if (player1Position == 100)
            System.out.println("🎉 Player 1 Wins!");
        else
            System.out.println("🎉 Player 2 Wins!");
    }

    static int movePlayer(int position, int dieRoll, int option) {

        int newPosition = position;

        if (option == LADDER)
            newPosition += dieRoll;
        else if (option == SNAKE)
            newPosition -= dieRoll;

        if (newPosition < 0)
            return 0;

        if (newPosition <= 100)
            return newPosition;

        return position;
    }
}
