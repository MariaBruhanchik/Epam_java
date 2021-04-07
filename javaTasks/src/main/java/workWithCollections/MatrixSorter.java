package main.java.workWithCollections;

import java.io.*;
import java.util.*;
public class MatrixSorter {
    public static void main(String[] args) throws IOException {

        String inputFileName = "c:/Users/User/Java-main/javaTasks/taskOne.txt";
        String outputFileName = "c:/Users/User/Java-main/javaTasks/newTaskOne.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFileName));
            String line;
            List<String> list = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                System.out.println(line + "\n");
                StringTokenizer stringTokenizer = new StringTokenizer(line, ",");
                while (stringTokenizer.hasMoreTokens()) {
                    String substring = stringTokenizer.nextToken();
                    bufferedWriter.write(substring);
                    bufferedWriter.newLine();

                    list.add(substring);
                    System.out.println(substring);


                }
                ;
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

