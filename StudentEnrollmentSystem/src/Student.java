import java.util.List;
import java.util.ArrayList;
public class Student{
    private final String Name;
    private final int Id;
    private final String Email;
    private List<Course> enrolledCourses;

    public Student(String name, int id, String email) {
        Name = name;
        Id = id;
        Email = email;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getName() {
        return Name;
    }


    public int getStudentId() {
        return Id;
    }

    public String getEmail() {
        return Email;
    }
    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

}
