package workWithClasses;

import java.util.ArrayList;
import java.util.List;

public class Abiturient {

    private static int idInstitut = 0;
    private String name;
    private String surname;
    private AcademicPerformance academicPerformance;

    Abiturient(String name, String surname) {
        this.name = name;
        this.surname = surname;
        idInstitut++;
        this.academicPerformance = new AcademicPerformance(idInstitut);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    AcademicPerformance getAcademicPerformance() {
        return academicPerformance;
    }
}

