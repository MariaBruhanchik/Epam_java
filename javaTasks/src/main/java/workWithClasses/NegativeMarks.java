package main.java.workWithClasses;

import java.util.*;

public class NegativeMarks {
    ArrayList<Abiturient> listOfAbiturients;
    int sumOfGrades = 20;
    int result;
    int satisfactoryMark = 4;
    int semiPassScore = 15;

    public NegativeMarks() {

    }

    public void sumOfGrades(ArrayList<Abiturient> list) {
        for (Abiturient abiturient : list)
            if (abiturient.getGrade1() + abiturient.getGrade2() + abiturient.getGrade3() + abiturient.getGrade4() > sumOfGrades) {
                result = abiturient.getGrade1() + abiturient.getGrade2() + abiturient.getGrade3() + abiturient.getGrade4();
                System.out.println(abiturient.getName() + " " + abiturient.getSurname() + " have a satisfactory sum of grades: " + result);
            } else {
                result = abiturient.getGrade1() + abiturient.getGrade2() + abiturient.getGrade3() + abiturient.getGrade4();
                System.out.println(abiturient.getName() + " " + abiturient.getSurname() + " have an unsatisfactory sum of grades: " + result);
            }
    }

    public void negativeMarks(ArrayList<Abiturient> list) {
        for (Abiturient abiturient : list) {
            if (abiturient.getGrade1() < satisfactoryMark) {
                System.out.println("Negative marks : " + abiturient.getGrade1() + " have an abiturient " + abiturient.getName() + " " + abiturient.getSurname());
            }
            if (abiturient.getGrade2() < satisfactoryMark) {
                System.out.println("Negative marks : " + abiturient.getGrade2() + " have an abiturient " + abiturient.getName() + " " + abiturient.getSurname());
            }
            if (abiturient.getGrade3() < satisfactoryMark) {
                System.out.println("Negative marks : " + abiturient.getGrade3() + " have an abiturient " + abiturient.getName() + " " + abiturient.getSurname());
            }
            if (abiturient.getGrade4() < satisfactoryMark) {
                System.out.println("Negative marks : " + abiturient.getGrade4() + " have an abiturient " + abiturient.getName() + " " + abiturient.getSurname());
            }
        }

    }

    static Comparator<Abiturient> compareBySumOfGrades = new Comparator<Abiturient>() {
        @Override
        public int compare(Abiturient abiturient, Abiturient anotherAbiturient) {
            return anotherAbiturient.getResult() - abiturient.getResult();
        }
    };

    public void passingScoreAndSemiPassScore(ArrayList<Abiturient> list) {
        for (Abiturient abiturient : list) {
            if (abiturient.getResult() > sumOfGrades) {
                System.out.println("Passing score have: " + abiturient.getName() + " " + abiturient.getSurname());
            }
            if (semiPassScore < abiturient.getResult() & abiturient.getResult() <= sumOfGrades) {
                System.out.println("Semi-pass score have: " + abiturient.getName() + " " + abiturient.getSurname());
            }
            ;
        }
    }
}