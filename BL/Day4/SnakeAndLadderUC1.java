package Day4;

public class SnakeAndLadderUC1 {
    public static void main(String[] args) {

        int dieRoll = (int) (Math.floor(Math.random() * 10) % 6) + 1;
        System.out.println("Die Roll: " + dieRoll);
    }

}