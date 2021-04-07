package main.java.fundamentalJava;

import java.util.Scanner;

public class ArraySorter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[5];
            System.out.println("Insert array elements: ");
        for (int i = 0; i < 5; i++) {
            array[i] = in.nextInt();
        }
            System.out.print("Inserted array elements: ");
        for (int i=0;i<5;i++){
            System.out.print(array[i]+" ");
        }

        for(int i=0;i<array.length;i++){
             for(int j=0;j<array.length-1-i;j++){
                 if(array[j]<array[j+1] ){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
            System.out.println("Sorted array: ");
        for (int number:array){
            System.out.println(number);

        }
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1] ){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted array2: ");
        for (int number:array){
            System.out.println(number);

        }
    }
}
