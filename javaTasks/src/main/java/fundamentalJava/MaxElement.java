package fundamentalJava;

import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insert the size of the matrix: ");
        int n = scan.nextInt();

        System.out.println("Matrix: a" + "[" + n + "]" + "[" + n + "]");
        int arr[][] = new int[n][n];
        int N = 100;
        int maxNumber = -100;
        int line = 0;
        int column = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * (N + N)) - N;

            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");

            }
            System.out.println();


        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (maxNumber < arr[i][j]) {
                    maxNumber = arr[i][j];
                    line = i;
                    column = j;
                }
            }
        }
        System.out.println("Max number: " + maxNumber + " Line: " + line + " Column: " + column);
        System.out.println("-------------------------");

        int[][] newArr = new int[n - 1][n - 1];
        int new_i = 0;
        int new_j = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (i != line) {
                    if (j != column) {
                        newArr[new_i][new_j] = arr[i][j];
                        ++new_j;
                    }
                } else {
                    --new_i;
                    break;
                }

            }
            ++new_i;
            new_j = 0;
        }
        for (int i = 0; i < n - 1; ++i) {
            for (int j = 0; j < n - 1; ++j) {
                System.out.print(newArr[i][j] + "\t");


            }
            System.out.println();


        }
    }
}
