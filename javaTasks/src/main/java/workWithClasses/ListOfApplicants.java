package workWithClasses;

import java.util.*;

public class ListOfApplicants {
    public static void main(String[] args) {

        ArrayList<Abiturient> listOfAbiturients = new ArrayList<>();

        Abiturient mary = new Abiturient("Marry", "Strange");
        mary.getAcademicPerformance().addSubjMark("Math", new Integer[]{8, 9, 4, 9});
        mary.getAcademicPerformance().addSubjMark("Physics", new Integer[]{5, 7, 3});
        Abiturient tom = new Abiturient("Tom", "Stark");
        tom.getAcademicPerformance().addSubjMark("Math", new Integer[]{3, 7, 6});
        tom.getAcademicPerformance().addSubjMark("Physics", new Integer[]{5, 8, 8});
        Abiturient bob = new Abiturient("Bob", "Stone");
        bob.getAcademicPerformance().addSubjMark("Math", new Integer[]{3, 5, 6});
        bob.getAcademicPerformance().addSubjMark("Physics", new Integer[]{5, 8, 2});

        System.out.println(mary.getName() + " " + mary.getSurname() + " " + mary.getAcademicPerformance());
        System.out.println(tom.getName() + " " + tom.getSurname() + " " + tom.getAcademicPerformance());
        System.out.println(bob.getName() + " " + bob.getSurname() + " " + bob.getAcademicPerformance());


        listOfAbiturients.add(mary);
        listOfAbiturients.add(tom);
        listOfAbiturients.add(bob);


    }

}
