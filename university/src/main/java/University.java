import exceptions.*;

import java.util.ArrayList;

public class University {
    public static void main(String[] args) {

        Student mary = new Student("Marry", "Strange");
        Student tom = new Student("Tom", "Stark");
        Student bob = new Student("Bob", "Stone");
        Student tony = new Student("Tony", "Stock");

        Group groupEconomic = null;
        Group groupLogistic=null;
        Group groupLinguistic = null;


        try {
            mary.getLearningSubjects().addSubjMark("Math", new Integer[]{8, 10, 4, 9});
            mary.getLearningSubjects().addSubjMark("Physics", new Integer[]{10, 10, 8});
            mary.getLearningSubjects().addSubjMark("Economic", new Integer[]{10, 8, 9});

            tom.getLearningSubjects().addSubjMark("Math", new Integer[]{3, 7, 6});
            tom.getLearningSubjects().addSubjMark("Physics", new Integer[]{5, 8, 8});

            bob.getLearningSubjects().addSubjMark("Math", new Integer[]{3, 5, 6});
            bob.getLearningSubjects().addSubjMark("Physics", new Integer[]{-1, 5, 8, 2});
            bob.getLearningSubjects().addSubjMark("Economic", new Integer[]{4, 6, 8, 6});

            tony.getLearningSubjects().addSubjMark("Math", new Integer[]{4, 5, 10});
            tony.getLearningSubjects().addSubjMark("Economic", new Integer[]{5, 9, 7});
            tony.getLearningSubjects().addSubjMark("Economic", new Integer[]{4, 7, 9});


            System.out.println(mary.getName() + " " + mary.getSurname() + " " + mary.getLearningSubjects());
            System.out.println(tom.getName() + " " + tom.getSurname() + " " + tom.getLearningSubjects());
            System.out.println(bob.getName() + " " + bob.getSurname() + " " + bob.getLearningSubjects());
            System.out.println(tony.getName() + " " + tony.getSurname() + " " + tony.getLearningSubjects());

            mary.getLearningSubjects().findMainSubject();
            tom.getLearningSubjects().findMainSubject();
            bob.getLearningSubjects().findMainSubject();
            tony.getLearningSubjects().findMainSubject();


            System.out.println("Average mark of all subjects:  " + "  " + mary.getLearningSubjects() + mary.getName() + " " + mary.getSurname() + "  " + mary.getLearningSubjects().averageStudentScoreForAllSubjects());


            groupEconomic.addStudent(mary);


            groupLinguistic.addStudent(tony);
            groupLinguistic.findStudent(mary);

            FacultyMethods facultyMethods = new FacultyMethods();
            System.out.println(facultyMethods.findGroup(groupEconomic, Faculty.LINGUISTIC));


            System.out.println((Faculty.valueOf("MATH")));
        } catch (WrongMarkException wrongMarkException) {
            System.out.println(wrongMarkException.getMessage() + " " + "Mark: " + wrongMarkException.getMark() + "  " + "StudentId: " + wrongMarkException.getStudentId());
        } catch (StudentNotFoundException | IllegalArgumentException | GroupNotFoundException studentNotFoundException) {
            System.out.println(studentNotFoundException.getMessage());
        } catch (NoSubjectException noSubjectException) {
            System.out.println(noSubjectException.getMessage() + "  " + "StudentId: " + noSubjectException.getStudentId());
        }finally{
            groupLinguistic = new Group(3, Faculty.LINGUISTIC);
            groupEconomic = new Group(1, Faculty.ECONOMIC);
            groupLogistic= new Group(2, Faculty.LOGISTIC);
            groupLogistic.addStudent(tom);
            groupLogistic.addStudent(bob);

            
            System.out.println("Group  № " + groupLogistic.getNumberOfGroup() + " : " + groupLogistic.getFaculty() + groupLogistic.averageSubjectScoreForGroup("Math"));

        }

    }
}
