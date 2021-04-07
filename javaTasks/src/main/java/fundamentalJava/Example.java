package main.java.fundamentalJava;

import java.util.Scanner;

import static java.lang.System.out;

public class Example {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        out.println("Input numbers: ");
        String number = in.nextLine();

        String[] array = number.split(" ");
        for (String element : array) {
            out.print(element + " ");
        }
        for (String element : array) {
            int n = Integer.parseInt(element);
            out.println(n);
        }
        int[] arr=new int[array.length];

        for (int i = 1; i < array.length; i++) {
            arr[i]++;
        }
    }
}