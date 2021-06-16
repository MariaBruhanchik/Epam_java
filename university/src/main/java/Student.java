public class Student {
    private static int idInstitut = 0;
    private String name;
    private String surname;
    private MethodsWithLearningSubjects methodsWithLearningSubjects;
    private Group group;

   Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        idInstitut++;
        this.methodsWithLearningSubjects = new MethodsWithLearningSubjects(idInstitut);
        this.group=new Group(idInstitut);

    }

    public Student() {
        }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    MethodsWithLearningSubjects getLearningSubjects() {
        return methodsWithLearningSubjects;
    }

    public Group getGroup() {
        return group;
    }


    public void setGroup(Group group) {
        if (this.group !=null){
            this.group.getStudents().remove(this);
            }
        this.group=group;
        this.group.getStudents().add(this);
}
}
