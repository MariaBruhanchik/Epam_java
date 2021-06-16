package exceptions;

public class WrongMarkException extends Exception{
    private int mark;
    private int studentId;

    public WrongMarkException (int studId, String message, int num){
        super(message);
        studentId=studId;
        mark=num;

     }

    public int getMark() {
        return mark;
    }

    public int getStudentId() {
        return studentId;
    }

}
