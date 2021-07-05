import java.io.*;

public class FlipLines {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            bufferedReader = new BufferedReader(new FileReader("src/main/java/FolderStructure.java"));
            try {
                bufferedWriter = new BufferedWriter(new FileWriter("src/main/resources/flipLines.txt"));

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            for (int i = line.length() - 1; i >= 0; i--) {
                try {
                    bufferedWriter.write(line.charAt(i));

                    System.out.println(line.charAt(i));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            bufferedWriter.newLine();
        }

        try {
            bufferedReader.close();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}