import java.util.List;
import java.util.ArrayList;

public class University {
    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public List<Course> getCourses() {
        return courses;
    }

    private List<Course> courses;
    public University() {
        students = new ArrayList<>();
        courses = new ArrayList<>();
    }
    public void addStudent(Student student) {
        students.add(student);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }
    public void enrollStudentInCourse(Student student, Course course) {
        if (students.contains(student) && courses.contains(course)) {
            course.enrollStudent(student);
        } else {
            System.out.println("الطالب او الكورس غير موجود.");
        }
    }

    public List<Course> getAllAvailableCourses() {
        List<Course> availableCourses = new ArrayList<>();
        for (Course course : courses) {
            if (course.getEnrolledStudents().size() < course.getCapacity()) {
                availableCourses.add(course);
            }
        }
        return availableCourses;
    }
}
