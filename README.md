# StudentEnrollmentSystem

The code consists of 3 classes required in the data, which are student, university, and course.

We store student information in their class in an intuitive way with Gettier and Setter working out the features they need to use.
We define a list of the courses in which the student registers.
Course class: We define the number for the subject, the doctor for it, the capacity as well, a list that includes the students registered in the course, and of course the course title. We have a function that registers the student in the course that we specify, and we reduce the capacity of the course, and if it does not accommodate it, we return the inability sentence because there is no vacancy for the student.
We also have a function through which we remove the student from a specific subject and increase the empty capacity of the course.

The university class we define a list for the student and a list for the course and we create a getter for them because of course we need it. Within this class we have a function for adding courses to the university and a function for adding a student to the university as well. We also have a function that displays the courses in which a student is registered and we inquire about him.

I would like to generalize an important point, which is that we do not need the server to change the student’s characteristics, but we need to change the course doctors, number, or name, for example.
We can also create an abstract function and change its body according to the addition of the student or course as well.
