package main.java.fundamentalJava;

import java.util.Scanner;

public class ShortAndLongNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Input numbers: ");
        String number=in.nextLine();
        String longNumber="";
        String shortNumber=number;
        for (String stringLine: number.split(" ")) {
        if(stringLine.length()>longNumber.length()){longNumber=stringLine;}
            if(stringLine.length()<shortNumber.length()){shortNumber=stringLine;}

        }
        System.out.println("Long number: "+ longNumber);
        System.out.println("Length: "+longNumber.length());
        System.out.println("Short number: "+shortNumber);
        System.out.println("Length: "+shortNumber.length());
        in.close();
    }

}
