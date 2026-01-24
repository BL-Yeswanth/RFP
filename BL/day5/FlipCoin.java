package day5;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of times to flip a coin : ");
        int n = sc.nextInt();

        if(n <= 0){
            System.out.println("please enter a positive value...");
            return;
        }

        int heads = 0;
        int tails = 0;

        for(int i=1; i<=n; i++){
            double randomValue = Math.random();
            if(randomValue<0.5){
                tails++;
            }
            else{
                heads++;
            }
        }

        double headPercentage = (heads*100.0)/n;
        double tailPercentage = (tails*100.0)/n;

        System.out.println("Heads count: " + heads);
        System.out.println("Tails count: " + tails);
        System.out.println("Heads Percentage: " + headPercentage + "%");
        System.out.println("Tails Percentage: " + tailPercentage + "%");

    }
}
