package workWithClasses;


import java.util.*;

public class AcademicPerformance {
    private int passingScore = 15;
    private int passingMark = 4;
    private int studentId;
    private Map<String, List<Integer>> academicPerformance = new HashMap<>();

    AcademicPerformance(int studentId) {
        this.studentId = studentId;
    }

    void addSubj(String nameSubject) {

        academicPerformance.put(nameSubject, new ArrayList());
    }

    void addSubjMark(String nameSubject, int mark) {
        academicPerformance.get(nameSubject).add(mark);
    }

    void addSubjMark(String nameSubject, Integer[] marks) {
        addSubj(nameSubject);
        academicPerformance.get(nameSubject).addAll(Arrays.asList(marks));
    }

    long getSumSubjMark(String nameSubject) {
        long sum = 0;
        for (Integer mark : academicPerformance.get(nameSubject))
            sum += mark;
        if (sum > passingScore) {
            System.out.println("Passed");
        } else {
            System.out.println("Don't passed");
        }
        return sum;

    }

    String getNegativeMarks(String nameSubject) {
        for (Integer mark : academicPerformance.get(nameSubject))
            if (mark < passingMark) {
                System.out.println("Negative mark : " + mark);
            }
        return "-checked-";
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, List<Integer>> entry : academicPerformance.entrySet()) {
            stringBuilder.append(entry.getKey())
                    .append("\t ==> \t")
                    .append(entry.getValue())
                    .append(getSumSubjMark(entry.getKey()))
                    .append('\n')
                    .append(getNegativeMarks(entry.getKey()))
                    .append('\n');


        }
        return "AcademicPerformance student #" + studentId + '\n' +
                stringBuilder.toString();
    }

}