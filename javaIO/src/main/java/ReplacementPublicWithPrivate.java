import java.io.*;


public class ReplacementPublicWithPrivate {
    public static void main(String[] args) throws IOException {
        String currentWord = "public";
        String replacedWord = "private";

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        BufferedWriter bufferedWriterUpperCase = null;


        try {
            bufferedReader = new BufferedReader(new FileReader("src/main/java/FolderStructure.java"));
            try {
                bufferedWriter = new BufferedWriter(new FileWriter("src/main/resources/replacementPublicWithPrivate.txt"));
                bufferedWriterUpperCase = new BufferedWriter(new FileWriter("src/main/resources/codeToUpperCase.txt"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
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
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriterUpperCase.flush();
        bufferedWriter.close();
        bufferedWriterUpperCase.close();

    }

}

