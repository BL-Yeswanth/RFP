package Day6;

public class Util4 {

    // static function to convert decimal to binary (32-bit)
    public static String toBinary(int n) {

        String binary = "";

        // check powers of 2 from 2^31 to 2^0
        for (int i = 31; i >= 0; i--) {
            int power = (int) Math.pow(2, i);

            if (n >= power) {
                binary = binary + "1";
                n = n - power;
            } else {
                binary = binary + "0";
            }
        }

        return binary;
    }

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        String result = toBinary(n);

        System.out.println("Binary (32-bit) = " + result);
    }
}
