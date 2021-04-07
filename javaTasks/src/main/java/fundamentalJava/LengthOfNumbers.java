package main.java.fundamentalJava;

import java.util.Scanner;

public class LengthOfNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input numbers: ");
        String number = in.nextLine();

        double average = 0;
        String[] array = number.split(" ");
            for (String element : array) {
            average += element.length();
        }
                if (array.length > 0) {
            average /= array.length;

            System.out.println("Average length: " + average);
            System.out.println("Large numbers: ");

            for (String element : array)
                if (element.length() > average) {
                    System.out.println(element + "  Length: " + element.length());
                }
            System.out.println("Smaller numbers: ");
            for (String element : array)
                if (element.length() < average) {
                    System.out.println(element + "  Length: " + element.length());
                }
        }
    }
}
