import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
public class Course {
    private int courseId;
    private final String courseTitle;
    private String teacher;
    private int capacity;
    private final List<Student> enrolledStudents;

    public Course(int courseId, String courseTitle, String instructor, int capacity) {
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.teacher = instructor;
        this.capacity = capacity;
        this.enrolledStudents = new ArrayList<>();
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public String getInstructor() {
        return teacher;
    }

    public void setInstructor(String instructor) {
        this.teacher = instructor;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void enrollStudent(Student student) {
        if (enrolledStudents.size() < capacity) {
            enrolledStudents.add(student);
            System.out.println("تم تسجيل الطالب " + student.getName() + " في الدورة.");
        } else {
            System.out.println("عذرًا، الدورة مكتملة، لا يمكن تسجيل: " + student.getName() );
        }
    }

    public void dropStudent(Student student) {
        if (enrolledStudents.remove(student)) {
            capacity++;
        } else {
            // الطالب لم يتم العثور عليه في الدورة
            System.out.println("الطالب" + student.getName() + " غير مسجل في الدورة.");
        }

    }
}
