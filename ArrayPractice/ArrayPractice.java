package ArrayPractice;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String args[]){

        //Assignment 1
    int[] randomarray = new int[20];
    int amount = 0;

    //Filling Array with random integers
    for(int i = 0; i < 20; i++) {
        randomarray[i] = (int) (Math.random()*6+1);
        }

    // Counting the amount of 1's in the array
    for(int i = 0; i < 20; i++) {
            if(randomarray[i] == 1){
                amount++;
            }
        }
    // Printing out the solution
    System.out.println("There are " + amount +" 1's in the first array");

    // Assignment 2
        int[] averagearray = new int[10];
        int total = 0;

        // Filling Array with random integers
        for(int i = 0; i < 10; i++) {
            averagearray[i] = (int) (Math.random()*100+1);
        }
        // Obtaining the total value of the array
        for(int i = 0; i < 10; i++) {
            total += averagearray[i];
        }
        // Printing out the average
        System.out.println("The average value of the 2nd array is " + total/10 + ".");

        // Assignment 3
        int temporary;
        temporary = averagearray[6];
        System.out.println("The value of index 3 in the 2nd array is " + averagearray[3]);
        System.out.println("The value of index 6 in the 2nd array is " + averagearray[6]);
        averagearray[6] = averagearray[3];
        averagearray[3] = temporary;
        System.out.println("Swapping Complete!");
        System.out.println("The value of index 3 in the 2nd array is " + averagearray[3]);
        System.out.println("The value of index 6 in the 2nd array is " + averagearray[6]);

        // Assignment 4

        System.out.println("Heres the original array: " + Arrays.toString(averagearray));
        for(int i = 0; i < 5; i++){
            temporary = averagearray[i];
            averagearray[i] = averagearray[9-i];
            averagearray[9-i] = temporary;
        }
        System.out.println("Heres the swapped array: " + Arrays.toString(averagearray));
    }
}
