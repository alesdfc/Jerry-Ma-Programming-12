public class Course {

    // Fields
    private String subject;
    private int grade;

    // Constructor to make a course object
    Course(String subject, int grade) {
        this.grade = grade;
        this.subject = subject;
    }

    // Returns the course name
    public String toString() {
        return "Course Name: " + this.subject;
    }

    // Getters and Setters
    public int getGrade() {
        return grade;
    }
}
