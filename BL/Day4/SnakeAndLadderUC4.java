package Day4;

public class SnakeAndLadderUC4 {
    public static void main(String[] args) {

        int position = 0;
        int NO_PLAY = 0, LADDER = 1, SNAKE = 2;

        while (position != 100) {

            int dieRoll = (int)(Math.random() * 6) + 1;
            int option = (int)(Math.random() * 3);

            int newPosition = position;

            if (option == LADDER)
                newPosition += dieRoll;
            else if (option == SNAKE)
                newPosition -= dieRoll;

            if (newPosition <= 100 && newPosition >= 0)
                position = newPosition;
        }

        System.out.println("Player won the game");
    }
}