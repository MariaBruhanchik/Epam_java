package fundamentalJava;

import java.util.Random;
import java.util.Scanner;

public class MatrixSorter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insert the size of the first and second matrix: ");
        int n = scan.nextInt();

        System.out.println("Matrix: a" + "[" + n + "]" + "[" + n + "]");
        int arr[][] = new int[n][n];
        int N = 100;
        Random rdm = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int)(Math.random()*(N+N))-N;

            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("-------------------------");


        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int k = i + 1; k < n; k++) {
                if (arr[0][i] > arr[0][k]) {
                    for (int j = 0; j < n; j++) {
                        temp = arr[j][i];
                        arr[j][i] = arr[j][k];
                        arr[j][k] = temp;

                    }

                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();

        }
        System.out.println("-------------------");
        int column = 0;
        for (int j = 0; j < n; j++) {
            for (int k = j + 1; k < n; k++) {
                if (arr[j][0] > arr[k][0]) {
                    for (int i = 0; i < n; i++) {
                        column = arr[j][i];
                        arr[j][i] = arr[k][i];
                        arr[k][i] = column;

                    }

                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();

        }

    }
}





