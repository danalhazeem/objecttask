package University;
public class Course {
    private String courseName;
    private String instructor;
    private int numberOfStudentsEnrolled;


    public Course(String courseName, String instructor, int numberOfStudentsEnrolled) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.numberOfStudentsEnrolled = numberOfStudentsEnrolled;
    }


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getNumberOfStudentsEnrolled() {
        return numberOfStudentsEnrolled;
    }

    public void setNumberOfStudentsEnrolled(int numberOfStudentsEnrolled) {
        this.numberOfStudentsEnrolled = numberOfStudentsEnrolled;
    }

    @Override
    public String toString() {
        return "Course" + "courseName=" + courseName + ", instructor=" + instructor + ", numberOfStudentsEnrolled=" + numberOfStudentsEnrolled ;
    }
}

