import exceptions.StudentNotFoundException;

import java.util.ArrayList;


public class Group {
    private int numberOfGroup;
    private Faculty faculty;
    private ArrayList<Student> students = new ArrayList<>();
    private int studentId;
    private MethodsWithLearningSubjects methodsWithLearningSubjects=new MethodsWithLearningSubjects(studentId);

    public Group(int numberOfGroup, Faculty faculty) {
        this.numberOfGroup = numberOfGroup;
        this.faculty = faculty;
    }

    public Group(int studentId) {
        this.studentId = studentId;
    }

    public Group(MethodsWithLearningSubjects methodsWithLearningSubjects) {
        this.methodsWithLearningSubjects = methodsWithLearningSubjects;
    }

    double averageSubjectScoreForGroup(String nameSubject) {
        float sum = 0;
        for (Integer mark : methodsWithLearningSubjects.getLearningSubjects().get(nameSubject))
            sum += mark;
        double avg = sum / students.size();

        return avg;
    }

    public void findStudent(Student student) throws StudentNotFoundException {
        if (students.contains(student)) {
            System.out.println("This student is in this group");
            new Student();
        } else {
            throw new StudentNotFoundException("No such student in this group");
        }
    }


    public void addStudent(Student student){
        student.setGroup(this);
    }

    public int getNumberOfGroup() {
        return numberOfGroup;
    }


    public Faculty getFaculty() {
        return faculty;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public int getStudentId() {
        return studentId;
    }
}











