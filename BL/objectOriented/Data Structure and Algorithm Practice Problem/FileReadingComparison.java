import java.io.*;

public class FileReadingComparison {

    public static void main(String[] args) throws Exception {

        String filePath = "sample.txt";

        // FileReader
        long start1 = System.nanoTime();

        FileReader fr = new FileReader(filePath);

        while (fr.read() != -1) {

        }

        fr.close();

        long end1 = System.nanoTime();

        // InputStreamReader
        long start2 = System.nanoTime();

        InputStreamReader isr =
                new InputStreamReader(new FileInputStream(filePath));

        while (isr.read() != -1) {

        }

        isr.close();

        long end2 = System.nanoTime();

        System.out.println("FileReader Time: " + (end1 - start1) + " ns");
        System.out.println("InputStreamReader Time: " + (end2 - start2) + " ns");
    }
}