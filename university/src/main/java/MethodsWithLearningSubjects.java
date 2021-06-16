import exceptions.NoSubjectException;
import exceptions.WrongMarkException;

import java.util.*;

public class MethodsWithLearningSubjects {

    private int studentId;
    private Map<String, List<Integer>> learningSubjects = new HashMap<>();
    private Map<String, Double> average = new HashMap<>();
    private int mainSubjects=3;

    MethodsWithLearningSubjects(int studentId) {
        this.studentId = studentId;
    }


    void addSubj(String nameSubject) {
        learningSubjects.put(nameSubject, new ArrayList());
        }


    void addSubjMark(String nameSubject, int mark) {
        learningSubjects.get(nameSubject).add(mark);
    }

    void addSubjMark(String nameSubject, Integer[] marks) throws WrongMarkException {
        addSubj(nameSubject);
            learningSubjects.get(nameSubject).addAll(Arrays.asList(marks));
            for (int i = 0; i <= marks.length - 1; i++)
                if (marks[i] < 0 || marks[i] > 10) {
                    throw new WrongMarkException(studentId, " The mark can't be less then 0 and more then 10", marks[i]);
                }

        }

    double getAverageSubjectMark(String nameSubject) {
        int sum = 0;
        for (Integer mark : learningSubjects.get(nameSubject))
            sum += mark;
        double avg = sum / learningSubjects.get(nameSubject).size();
        average.put(nameSubject, avg);
        return avg;
    }

    double averageStudentScoreForAllSubjects() {
        int sum = 0;
        for (Double avg : average.values())
            sum += avg;
        double averageScore = sum / average.size();
        return averageScore;
    }

    void findMainSubject() throws NoSubjectException {

        if (average.size()==mainSubjects){
            System.out.println("All subjects"+"  "+"StudentId: " +studentId);
        }else {
            throw new NoSubjectException("Missing subject", studentId);
        }
    }

    public int getStudentId() {
        return studentId;
    }

    public Map<String, Double> getAverage() {
        return average;
    }

    public Map<String, List<Integer>> getLearningSubjects() {
        return learningSubjects;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, List<Integer>> entry : learningSubjects.entrySet()) {
            stringBuilder.append(entry.getKey())
                    .append("\t ==> \t")
                    .append(entry.getValue())
                    .append(getAverageSubjectMark(entry.getKey()))
                    .append('\n');


        }
        return "Learning subjects student #" + studentId + '\n' +
                stringBuilder.toString();
    }

}

