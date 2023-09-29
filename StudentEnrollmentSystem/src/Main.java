import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Shahd Hamamrah", 11923976, "shahdhamamrah7@gmail.com");
        Student student2 = new Student("Mohammad Azem", 11923978, "mohammad1999@gmail.com");
        Student student3 = new Student("Mosab Maher", 11923979, "mosab2000@gmail.com");


        Course course1 = new Course(1, "Programing languge1", "Suhad Daraghmah", 2);
        Course course2 = new Course(2, "Algorithm", "Amjad Hawash", 1);
        Course course3 = new Course(3, "Softwar", "Mustafa Assaf", 1);

        University university = new University();

        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);

        university.addCourse(course1);
        university.addCourse(course2);
        university.addCourse(course3);

        university.enrollStudentInCourse(student1, course1);
        university.enrollStudentInCourse(student2, course1);
        university.enrollStudentInCourse(student2, course2);
        university.enrollStudentInCourse(student3, course2);

        System.out.println("Available Courses:");
        List<Course> availableCourses = university.getAllAvailableCourses();
        for (Course course : availableCourses) {
            System.out.println(course.getCourseId() + ": " + course.getCourseTitle());
        }

        System.out.println("\nCourses enrolled by Shahd Hamamrah:");
        List<Course> shCourses = student1.getEnrolledCourses();
        for (Course course : shCourses) {
            System.out.println(course.getCourseId() + ": " + course.getCourseTitle());
        }

        System.out.println("\nStudents enrolled in Course Algorithm:");
        List<Student> enrolledStudentsAlgo = course2.getEnrolledStudents();
        for (Student student : enrolledStudentsAlgo) {
            System.out.println(student.getStudentId() + ": " + student.getName());
        }
        course1.dropStudent(student1);
        System.out.println("المساحة بعد حذف الطالب ١ من مادة رقم ١ : " + course1.getCapacity() );
    }


}
