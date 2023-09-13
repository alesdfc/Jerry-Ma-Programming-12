package ConditionalsPractice;
import java.util.Scanner;
public class Assignment2 {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! What is your name?");
        String name = scanner.nextLine();
        System.out.println("Wait! What is your age? I almost forgot to ask");
        int age = Integer.parseInt(scanner.nextLine());
        if(age >= 25){
            System.out.println("Congratulations you can do basically anything " + name);
        } else if(age >= 18){
            System.out.println("You can vote! However, you can't rent a car yet, " + name);
        } else if(age >= 16){
            System.out.println("You can drive, but you cant vote unfortunately " + name);
        } else {
            System.out.println("You can't drive " + name);
        }
    }
}
