package ConditionalsPractice;

import java.util.Scanner;

public class ALittleQuiz {
    public static void main( String[] args ) {

        //intro
        int correct = 0;
        System.out.println("Do you want to play a short trivia quiz?");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Too bad you're doing it anyways because i told you so");

        //Question 1
        System.out.println("Which of the following elements has the symbol Ce? please input your response as a number");

        System.out.println("1. Cesium");
        System.out.println("2. Curium");
        System.out.println("3. Cerium");
        System.out.println("4. Cadmium");
        Scanner scanner = new Scanner(System.in);
        int answer = Integer.parseInt(scanner.nextLine());
        if(answer == 3){
            System.out.print("Correct! Cesium is Cs, Curium is Cm, and Cadmium is Cd");
            correct++;
        } else {
            System.out.println("Too bad, the correct answer was 3. Cerium");
        }

        //Question 2
        System.out.println("How much does it cost to produce an american penny?");

        System.out.println("1. $0.01");
        System.out.println("2. $0.02");
        System.out.println("3. $0.05");
        System.out.println("4. $0.015");
        answer = Integer.parseInt(scanner.nextLine());
        if(answer == 2){
            System.out.print("Correct! This is what it usually averages out to, meaning that money is lost when minting pennies");
            correct++;
        } else {
            System.out.println("Too bad, the correct answer was 2. $0.02. Strange to think about isn't it?");
        }

        //Question 3
        System.out.println("Last question, Did you enjoy this quiz?????");

        System.out.println("1. YESSSSS!!!");
        System.out.println("2. No!!!!! You forced me into this and i didn't ask for it");

        answer = Integer.parseInt(scanner.nextLine());
        if(answer == 1){
            System.out.println("Correct! Thanks for playing!");
            correct++;
        } else {
            System.out.println("cry about it lmao");
        }

        //Final Result
        System.out.println("You scored " + correct + "/3");
    }
}
