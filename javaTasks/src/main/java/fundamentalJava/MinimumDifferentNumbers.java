package fundamentalJava;

import java.util.*;

import static java.lang.System.*;

public class MinimumDifferentNumbers {


    public static int diffCount(int n) {

        int[] count = new int[10];
        int differentCount = 0;

        while (n != 0) {
            count[n % 10]++;
            n /= 10;
        }
        for (int i = 0; i < 10; i++) {
            if (count[i] > 0)
                differentCount++;

        }
        return differentCount;
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        out.println("Input size of matrix: ");
        int [] arr=new int[in.nextInt()];

        out.println("Elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();


        }
            int i,number,numberOfDiffDigits,k;
            numberOfDiffDigits=diffCount(arr[0]);
            number=arr[0];
            for (i=1; i<arr.length; i++)
            {
                k=diffCount(arr[i]);
                if (k<numberOfDiffDigits)
                {
                    numberOfDiffDigits=k;
                    number=arr[i];
                }
            }
            System.out.println( "Minimum number of different digits: "+number);
        }
        }





















