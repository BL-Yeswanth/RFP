package Day6;

import java.util.Scanner;

public class Util {

    // static function for temperature conversion
    public static double temperatureConversion(double temp, char unit) {

        double result;

        if (unit == 'C' || unit == 'c') {
            // Celsius to Fahrenheit
            result = (temp * 9 / 5) + 32;
        } else if (unit == 'F' || unit == 'f') {
            // Fahrenheit to Celsius
            result = (temp - 32) * 5 / 9;
        } else {
            System.out.println("Invalid unit");
            return 0;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();

        System.out.print("Enter unit (C or F): ");
        char unit = sc.next().charAt(0);

        double converted = temperatureConversion(temp, unit);

        System.out.println("Converted temperature = " + converted);
    }
}
