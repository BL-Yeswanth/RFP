package Day4;

public class SnakeAndLadderUC3 {
    public static void main(String[] args) {

        int position = 0;
        int NO_PLAY = 0, LADDER = 1, SNAKE = 2;

        while (position < 100) {

            int dieRoll = (int)(Math.random() * 6) + 1;
            int option = (int)(Math.random() * 3);

            if (option == LADDER)
                position += dieRoll;
            else if (option == SNAKE)
                position -= dieRoll;

            if (position < 0)
                position = 0;
        }

        System.out.println("Player reached position 100");
    }


}