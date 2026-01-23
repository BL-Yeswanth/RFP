package Day6;

public class Binary {

    // convert decimal to 8-bit binary
    public static String toBinary(int n) {
        String binary = "";

        for (int i = 7; i >= 0; i--) {
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

    // swap two nibbles (4 bits each)
    public static String swapNibbles(String binary) {
        String firstNibble = binary.substring(0, 4);
        String secondNibble = binary.substring(4, 8);

        return secondNibble + firstNibble;
    }

    // convert binary string to decimal
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal = decimal + (int) Math.pow(2, power);
            }
            power++;
        }
        return decimal;
    }

    // check power of 2
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {

        int number = Integer.parseInt(args[0]);

        String binary = toBinary(number);
        System.out.println("Binary (8-bit)      : " + binary);

        String swapped = swapNibbles(binary);
        System.out.println("After Nibble Swap  : " + swapped);

        int newNumber = binaryToDecimal(swapped);
        System.out.println("Decimal Value      : " + newNumber);

        if (isPowerOfTwo(newNumber)) {
            System.out.println("Result is a Power of 2");
        } else {
            System.out.println("Result is NOT a Power of 2");
        }
    }
}
