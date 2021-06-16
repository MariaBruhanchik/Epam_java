import exceptions.FacultyNotFoundException;
import exceptions.GroupNotFoundException;

public class FacultyMethods {
    private Faculty faculty;

    public FacultyMethods() {

    }

    public boolean findGroup(Group group, Faculty faculty) throws GroupNotFoundException {
        if (group.getFaculty().equals(faculty)) {
            return true;
        } else {
            throw new GroupNotFoundException("No such group in faculty");
        }

    }


}
