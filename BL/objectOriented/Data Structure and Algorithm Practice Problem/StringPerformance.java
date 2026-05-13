public class StringPerformance {

    public static void main(String[] args) {

        int n = 100000;

        // String
        long start1 = System.nanoTime();

        String str = "";

        for (int i = 0; i < n; i++) {
            str += "Java";
        }

        long end1 = System.nanoTime();

        // StringBuilder
        long start2 = System.nanoTime();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append("Java");
        }

        long end2 = System.nanoTime();

        // StringBuffer
        long start3 = System.nanoTime();

        StringBuffer sf = new StringBuffer();

        for (int i = 0; i < n; i++) {
            sf.append("Java");
        }

        long end3 = System.nanoTime();

        System.out.println("String Time: " + (end1 - start1) + " ns");
        System.out.println("StringBuilder Time: " + (end2 - start2) + " ns");
        System.out.println("StringBuffer Time: " + (end3 - start3) + " ns");
    }
}