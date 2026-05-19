import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchService;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchKey;
import java.nio.file.WatchEvent;

public class DirectoryWatchService {

    // Count Number of Entries in File
    public static int countEntriesInFile(
            String filePath) {

        int count = 0;

        try {

            BufferedReader reader =
                    new BufferedReader(
                            new FileReader(filePath)
                    );

            while (reader.readLine() != null) {

                count++;
            }

            reader.close();

        } catch (Exception e) {

            System.out.println(
                    e.getMessage()
            );
        }

        return count;
    }

    public static void main(String[] args)
            throws IOException, InterruptedException {

        // Directory Path
        Path path =
                Paths.get("PayrollFolder");

        // Create Watch Service
        WatchService watchService =
                FileSystems.getDefault()
                        .newWatchService();

        // Register Events
        path.register(
                watchService,
                StandardWatchEventKinds.ENTRY_CREATE,
                StandardWatchEventKinds.ENTRY_DELETE,
                StandardWatchEventKinds.ENTRY_MODIFY
        );

        System.out.println(
                "Watching Directory : "
                        + path.toAbsolutePath()
        );

        // Count Entries in employee.txt
        File file =
                new File("employee.txt");

        if (file.exists()) {

            int lines =
                    countEntriesInFile(
                            "employee.txt"
                    );

            System.out.println(
                    "Number of Entries in File : "
                            + lines
            );

        } else {

            System.out.println(
                    "employee.txt File Not Found"
            );
        }

        // Watch Directory Changes
        while (true) {

            WatchKey key =
                    watchService.take();

            for (WatchEvent<?> event
                    : key.pollEvents()) {

                System.out.println(
                        "Event Type : "
                                + event.kind()
                );

                System.out.println(
                        "File : "
                                + event.context()
                );
            }

            boolean valid = key.reset();

            if (!valid) {

                break;
            }
        }
    }
}