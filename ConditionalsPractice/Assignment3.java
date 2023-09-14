package ConditionalsPractice;

import java.util.Scanner;

public class Assignment3 {
    public static void main( String[] args ) {

        //Asking and Information
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your current weight on earth in pounds:");
        double weight = Double.parseDouble(scanner.nextLine());
        System.out.println("Which of the following planets are you visiting? Please enter the number beside your choice");
        System.out.println("    1. Venus,  2. Mars,  3. Jupiter");
        System.out.println("    4. Saturn,  5. Uranus,  6. Neptune");

        //Calculations
        int planet = Integer.parseInt(scanner.nextLine());
        if (planet ==1){
            weight = weight*0.78;
        } else if(planet == 2){
            weight = weight*0.39;
        }else if(planet == 3){
            weight = weight*2.65;
        }else if(planet == 4){
            weight = weight*1.17;
        }else if(planet == 5){
            weight = weight*1.05;
        }else if(planet == 6){
            weight = weight*1.23;
        } else {
            System.out.println("You failed to provide a valid answer, please try again.");
            System.exit(0);
        }
        System.out.println("Your weight on that planet would be " + weight);
    }
}
