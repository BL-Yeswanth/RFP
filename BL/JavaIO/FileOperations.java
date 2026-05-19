import java.io.File;

public class FileOperations {

    public static void main(String[] args) {

        // File Path
        File file =
                new File("employee.txt");

        // Check File Exists
        if (file.exists()) {

            System.out.println(
                    "File Exists"
            );

        } else {

            System.out.println(
                    "File Does Not Exist"
            );
        }

        // Create Empty File
        try {

            boolean created =
                    file.createNewFile();

            if (created) {

                System.out.println(
                        "File Created Successfully"
                );

            } else {

                System.out.println(
                        "File Already Exists"
                );
            }

        } catch (Exception e) {

            System.out.println(
                    e.getMessage()
            );
        }

        // Check File Exists Again
        if (file.exists()) {

            System.out.println(
                    "File Exists After Creation"
            );
        }

        // Create Directory
        File directory =
                new File("PayrollFolder");

        if (directory.mkdir()) {

            System.out.println(
                    "Directory Created"
            );

        } else {

            System.out.println(
                    "Directory Already Exists"
            );
        }

        // List Files and Directories
        File currentFolder =
                new File(".");

        File[] files =
                currentFolder.listFiles();

        System.out.println(
                "\nFiles and Directories:"
        );

        for (File f : files) {

            if (f.isDirectory()) {

                System.out.println(
                        "Directory : "
                                + f.getName()
                );

            } else {

                System.out.println(
                        "File : "
                                + f.getName()
                );
            }
        }

        // List Only .txt Files
        System.out.println(
                "\nText Files:"
        );

        for (File f : files) {

            if (f.isFile()
                    &&
                    f.getName().endsWith(".txt")) {

                System.out.println(
                        f.getName()
                );
            }
        }

        // Delete File
        if (file.delete()) {

            System.out.println(
                    "\nFile Deleted Successfully"
            );

        } else {

            System.out.println(
                    "\nFile Not Deleted"
            );
        }

        // Check File Not Exists
        if (!file.exists()) {

            System.out.println(
                    "File Does Not Exist After Delete"
            );
        }
    }
}