package main.java.fundamentalJava;

import java.util.Scanner;

import static java.lang.System.*;

public class DifferentNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            out.println("Input numbers: ");
        String number = in.nextLine();

        String[] array = number.split(" ");
        for(String element:array) {
            out.print(element + " ");
        }
        for(String element:array){
            int n=Integer.parseInt(element);
            out.println(n);

            int []count=new int[10];
            int differentCount=0;

            while (n!=0){
                count[n%10]++;
                n/=10;
            }
            for(int i=0;i<10;i++) {
                if (count[i] > 0)
                    differentCount++;
            }
                if(differentCount==element.length()) {
                    System.out.println("This number consists of different digits  "+element);
                    break;
                }
                    System.out.println("Different digits: "+ differentCount+"  "+" Length: "+element.length());

        }
    }
}
