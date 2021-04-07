package main.java.fundamentalJava;

public class MainTask {
    public static void main(String[] args) {
        String name = "Maria";
        System.out.println("Добрый день, "+ name+ "!" );

        int [] reverseArray={1,2,5,9,42,56,78,98,54,23,11};
        System.out.print("Массив: "+reverseArray);

       // System.out.print("\nМассив в обратном порядке: ");
        System.out.println("Массив в обратном порядке: ");

        for (int i = reverseArray.length-1; i>=0;i--) {
         //   System.out.print(reverseArray[i]+" ");
        System.out.println(reverseArray[i]+" ");
        }

        int a=25;
        int b=56;
        int sum=a+b;
        int multi=a*b;
        System.out.println("Сумма чисел: "+sum);
        System.out.println("Произведение чисел: "+multi);


    }
}
