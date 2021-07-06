import java.io.*;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Objects;

public class FolderStructure {
    public static void main(String[] args) {
        int countFolders=0;
        int countFile=0;
        int countSpell=0;
        int averageCountFile=0;
        int countAllSpell=0;
        double averageSpell=0;

        File directory = new File("C:/Users/User/Pictures/photo");
        PrintStream printStream = null;
        try {
            printStream = new PrintStream(new FileOutputStream(PathToDirectory.pathFileName + "folderStructure.txt"));

            if (directory.exists() && directory.isDirectory()) {
                printStream.println("Directory: " + directory.getName());

                for (File current : Objects.requireNonNull(directory.listFiles())) {
                    System.setOut(printStream);
                    countFolders++;
                    long millis = current.lastModified();
                    LocalDateTime dateTime = Instant.ofEpochMilli(millis).atZone(ZoneId.systemDefault()).toLocalDateTime();
                    printStream.println("|-----" + "  " + dateTime + " ---  " + current.getName());
                    System.setOut(printStream);
                    int count = 0;
                    for (File file : Objects.requireNonNull(current.listFiles())) {
                        count++;
                        printStream.println("    | " + count + " " + file.getName());
                        System.setOut(printStream);
                        countSpell = file.getName().length();
                        countAllSpell+=countSpell;
                    }

                    countFile+=count;
                    averageCountFile=countFile/countFolders;
                    averageSpell=Math.ceil(countAllSpell/countFile);
                }
                System.out.println("CountFolder  "+countFolders);
                System.out.println("CountFile  "+ countFile);
                System.out.println("Average count file: "+averageCountFile);
                System.out.println("Count spell " +countAllSpell);
                System.out.println("Average spell "+averageSpell);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
