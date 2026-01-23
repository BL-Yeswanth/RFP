package Day6;

public class Util2 {

    // static function to calculate monthly payment
    public static double monthlyPayment(double P, double Y, double R) {

        double n = 12 * Y;              // number of months
        double r = R / (12 * 100);      // monthly interest rate

        double payment = (P * r) / (1 - Math.pow(1 + r, -n));

        return payment;
    }

    public static void main(String[] args) {

        double P = Double.parseDouble(args[0]); // principal
        double Y = Double.parseDouble(args[1]); // years
        double R = Double.parseDouble(args[2]); // interest rate

        double result = monthlyPayment(P, Y, R);

        System.out.println("Monthly Payment = " + result);
    }
}
