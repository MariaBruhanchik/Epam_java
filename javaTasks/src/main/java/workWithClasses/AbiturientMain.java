package main.java.workWithClasses;


import java.util.*;

public class AbiturientMain {

    public static void main(String[] args) {

        ArrayList<Abiturient> listOfAbiturients = new ArrayList<>();
        NegativeMarks marks = new NegativeMarks();

        listOfAbiturients.add(new Abiturient(1, "Mary", "Pool", 4, 5, 2, 9, marks.result));
        listOfAbiturients.add(new Abiturient(2, "Tom", "Formel", 3, 8, 6, 1, marks.result));
        listOfAbiturients.add(new Abiturient(3, "Kate", "Strong", 7, 9, 8, 5, marks.result));
        listOfAbiturients.add(new Abiturient(4, "Sara", "Walter", 10, 10, 10, 9, marks.result));
        listOfAbiturients.add(new Abiturient(5, "Sam", "Strange", 3, 2, 4, 3, marks.result));


        marks.negativeMarks(listOfAbiturients);
        marks.sumOfGrades(listOfAbiturients);
        marks.passingScoreAndSemiPassScore(listOfAbiturients);
        Collections.sort(listOfAbiturients, NegativeMarks.compareBySumOfGrades);

        System.out.println("Highest score: " + listOfAbiturients.get(0));

    }

}
