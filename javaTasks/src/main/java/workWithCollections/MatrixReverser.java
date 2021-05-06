package workWithCollections;

import java.io.*;
import java.util.*;

public class MatrixReverser {
    public static void main(String[] args) throws IOException {

        String inputFileName = "src/main/resources/taskOne.txt";
        String outputFileName = "src/main/resources/newTaskOne.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFileName));
            String line;
            List<String> list = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                list.addAll(Arrays.asList(line.split(",")));
                // from the string to column
                StringTokenizer stringTokenizer = new StringTokenizer(line, ",");
                while (stringTokenizer.hasMoreTokens()) {
                    String substring = stringTokenizer.nextToken();
                    bufferedWriter.write(substring);
                    bufferedWriter.newLine();
                    list.add(substring);

                }
            }

            Collections.reverse(list);
            StringTokenizer stringTokenizer = new StringTokenizer(list.toString(), ",");
            while (stringTokenizer.hasMoreTokens()) {
                String substring = stringTokenizer.nextToken();
                bufferedWriter.append(substring);
                bufferedWriter.newLine();
            }
            ;
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

