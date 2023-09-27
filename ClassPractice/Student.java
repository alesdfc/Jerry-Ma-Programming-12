import java.util.ArrayList;

public class Student {

    // Setting the fields in place
    private String firstName;
    private static int identification = 0;
    private int studentId;

    private ArrayList<Course> courselist = new ArrayList<>();

    // Constructor that makes a student object
    Student(String firstName) {
        this.firstName = firstName;
        this.studentId = identification;
        this.courselist = courselist;
        identification++;
    }

    // Gives the name and ID of a student
    public String toString() {
        return "Name: " + this.firstName + "| Student ID: " + this.studentId;
    }


    //Adds a course to the student
    public void addCourse(String subject, int grade) {
        courselist.add(new Course(subject, grade));
    }

    //Prints out the arraylist of courses
    public String showCourses() {
        return courselist.toString();
    }

    //Returns the average grade of a student
    public int averageGrade(){
        int total = 0;
        for(int i = 0; i < courselist.size(); i++){
            total += courselist.get(i).getGrade();
        }
        return (total/(courselist.size()));
    }

    // Getters and Setters
    public ArrayList getCourses(){
        return courselist;
    }
    public String getFirstName(){
        return firstName;
    }
    public int getID(){
        return studentId;
    }
    public void setFirstName(String name){
        this.firstName = name;
    }
}
