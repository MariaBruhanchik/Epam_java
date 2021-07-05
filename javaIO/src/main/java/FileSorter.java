import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class FileSorter {
    public static void main(String[] args) {
        BufferedWriter bufferedWriter = null;

        try {
            bufferedWriter = new BufferedWriter(new FileWriter("src/main/resources/fileSorter.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        String stringNumber = "";
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
            System.out.println(array[i]);

        }
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (array[j] < array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
            stringNumber = Integer.toString(array[i]);
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.write(stringNumber);
                    bufferedWriter.newLine();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        try {
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}

