import java.io.*;

public class FlipLines {
    public static void main(String[] args) throws IOException {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/java/FolderStructure.java"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PathToDirectory.pathFileName + "flipLines.txt"))) {

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                for (int i = line.length() - 1; i >= 0; i--) {
                    bufferedWriter.write(line.charAt(i));
                }
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}