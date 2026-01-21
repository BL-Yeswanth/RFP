package Day4;

public class SnakeAndLadderUC2 {
    public static void main(String[] args) {

        int NO_PLAY = 0;
        int LADDER = 1;
        int SNAKE = 2;

        int dieRoll = (int)(Math.random() * 6) + 1;
        int option = (int)(Math.random() * 3);

        int position = 0;

        if (option == NO_PLAY) {

        } else if (option == LADDER) {
            position += dieRoll;
        } else {
            position -= dieRoll;
        }

        System.out.println("Position: " + position);
    }

}