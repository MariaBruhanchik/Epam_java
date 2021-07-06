import java.io.*;


public class ReplacementPublicWithPrivate {
    public static void main(String[] args) {
        String currentWord = "public";
        String replacedWord = "private";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/java/FolderStructure.java"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PathToDirectory.pathFileName + "replacementPublicWithPrivate.txt"));
             BufferedWriter bufferedWriterUpperCase = new BufferedWriter(new FileWriter(PathToDirectory.pathFileName + "codeToUpperCase.txt"))) {

            String line = null;

            while ((line = bufferedReader.readLine()) != null) {
                String newString[] = line.split("; ");
                for (String string : newString) {
                    string = string.replaceAll(currentWord.toLowerCase(), replacedWord.toLowerCase());
                    bufferedWriter.write(string + " ");
                    bufferedWriter.newLine();
                }
                for (String replString : newString) {
                    replString = line.toUpperCase();
                    bufferedWriterUpperCase.write(replString + " ");
                    bufferedWriterUpperCase.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}

