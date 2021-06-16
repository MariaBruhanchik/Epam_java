package exceptions;

public class NoSubjectException extends Exception {
private int studentId;
     public NoSubjectException(String message,int studId){
        super(message);
        studentId=studId;
       }

    public int getStudentId() {
        return studentId;
    }
}
