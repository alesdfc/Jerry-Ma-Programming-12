public class Main {
    public static void main(String[] args) {
        Student cool = new Student("wow");
        cool.addCourse("silly course", 100);
        cool.addCourse("sillier course", 4);
        cool.addCourse("silliest course", 17);
        cool.addCourse("shenanigans course", 80);
        cool.addCourse("backyardigans course", 99);
        System.out.println(cool.showCourses());
        System.out.println("The average grade of this student is: " + cool.averageGrade());
        System.out.println(cool);
        Course testing = new Course("lorem ispum", 0);
        System.out.println(testing);
        Student notcool = new Student("What's my id??? is it one higher than wow?");
        System.out.println(notcool);
    }
}
