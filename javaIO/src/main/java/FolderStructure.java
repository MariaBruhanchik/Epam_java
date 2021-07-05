import java.io.*;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class FolderStructure {
    public static void main(String[] args) {
        File directory = new File("C:/Users/User/Pictures/photo");
        PrintStream printStream = null;
        try {
            printStream = new PrintStream(new FileOutputStream("src/main/resources/folderStructure.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (directory.exists() && directory.isDirectory()) {
            for (File current : directory.listFiles()) {
                printStream.println("Directory: " + directory.getName());
                System.setOut(printStream);
                long millis = current.lastModified();
                LocalDateTime dateTime = Instant.ofEpochMilli(millis).atZone(ZoneId.systemDefault()).toLocalDateTime();
                printStream.println("|-----" + "  " + dateTime + " ---  " + current.getName());
                System.setOut(printStream);
                int count = 0;
                for (File file : current.listFiles()) {
                    count++;
                    printStream.println("    | " + count + " " + file.getName());
                    System.setOut(printStream);

                }

            }


        }

    }

}
