package main.java.workWithClasses;

public class Abiturient {

    private int id;
    private String name;
    private String surname;
    private String patronymic;
    private int grade1;
    private int grade2;
    private int grade3;
    private int grade4;
    private int result;

    public Abiturient() {

    }

    private class Adress {
        private String adress;
        private int phoneNumber;

        public Adress(String adress, int phoneNumber) {
            this.adress = adress;
            this.phoneNumber = phoneNumber;
        }

        public String getAdress() {
            return adress;
        }

        public void setAdress(String adress) {
            this.adress = adress;
        }

        public int getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(int phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        @Override
        public String toString() {
            return "Adress{" +
                    "adress='" + adress + '\'' +
                    ", phoneNumber=" + phoneNumber +
                    '}';
        }
    }

    public Abiturient(int id, String name, String surname, int grade1, int grade2, int grade3, int grade4, int result) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.grade4 = grade4;
        this.result = result;
    }

    public Abiturient(int id, String name, String surname, String patronymic, int grade1, int grade2, int grade3, int grade4) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.grade4 = grade4;
    }

    public Abiturient(String name, String surname, int grade1, int grade2, int grade3, int grade4) {
        this.name = name;
        this.surname = surname;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.grade4 = grade4;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getGrade1() {
        return this.grade1;
    }

    public void setGrade1(int grade1) {
        this.grade1 = grade1;
    }

    public int getGrade2() {
        return this.grade2;
    }

    public void setGrade2(int grade2) {
        this.grade2 = grade2;
    }

    public int getGrade3() {
        return grade3;
    }

    public void setGrade3(int grade3) {
        this.grade3 = grade3;
    }

    public int getGrade4() {
        return grade4;
    }

    public void setGrade4(int grade4) {
        this.grade4 = grade4;
    }

    public int getResult() {
        return grade1 + grade2 + grade3 + grade4;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Abiturient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", grade1=" + grade1 +
                ", grade2=" + grade2 +
                ", grade3=" + grade3 +
                ", grade4=" + grade4 +
                '}';
    }
}

