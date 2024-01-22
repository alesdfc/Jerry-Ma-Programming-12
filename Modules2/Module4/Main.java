package Module4;
import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Main {
    /* Reads each individual word and replaces any variation
    in capitalization or punctuation with an empty space then places it into a hashset
     */
    public static void main(String[] args) throws Exception{
        Set<String> uniqueWords = new HashSet<String>();
        Scanner input = new Scanner(new File("illiad.txt"));
        while (input.hasNext()) {
            String word = input.next().toLowerCase().replaceAll("[^*+a-z=$%&@0-9/]", "");
            uniqueWords.add(word);
        }
        input.close();
        System.out.println("Number of unique words: " + uniqueWords.size());
    }
}