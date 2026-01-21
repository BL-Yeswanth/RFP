package Day4;

public class SnakeAndLadderUC6 {

    private static final int NO_PLAY = 0;
    private static final int LADDER = 1;
    private static final int SNAKE = 2;

    public static void main(String[] args) {

        int position = 0;
        int diceCount = 0;

        while (position != 100) {

            diceCount++;

            int dieRoll = (int)(Math.random() * 6) + 1;
            int option = (int)(Math.random() * 3);

            int newPosition = position;

            if (option == LADDER)
                newPosition += dieRoll;
            else if (option == SNAKE)
                newPosition -= dieRoll;

            if (newPosition < 0)
                position = 0;
            else if (newPosition <= 100)
                position = newPosition;

            System.out.println("Die Roll: " + dieRoll + " | Position: " + position);
        }

        System.out.println("🎉 Player won the game!");
        System.out.println("Total Dice Rolls: " + diceCount);
    }
}
