package ReadingText;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;
public class ReadingText {
    // Reads lines from document and adds it into an ArrayList. Then asks
    // user for input and calls for searchWord method
    public static void main(String[] args) throws Exception {
        // Read lines from text file
        ArrayList<String> text = new ArrayList<>();
        FileReader fr = new FileReader("ProgrammingHistory.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;

        while ((line = br.readLine()) != null) {
            text.add(line);
        }
        br.close();

        // Asks user for input
        Scanner scan = new Scanner(System.in);
        System.out.println("What word do you want to search? Capitalization matters!");
        String word = scan.nextLine();
        scan.close();

        searchWord(text, word);
    }

    // Effects: Searches ArrayList for the inputted word
    public static void searchWord(ArrayList<String> text, String word) {
        String answer = null;
        for (int i = 0; i < text.size(); i++) {
            if (text.get(i).contains(word)) {
                answer = word + " appears at index: " + (i+1) + " in the Arraylist, or the sentence. The word starts at index " +  text.get(i).indexOf(word) + " in the sentence\n"  ;
            }
        }

        if(answer == null){
            System.out.println("Sorry, we couldn't find the word in the text. Would you like to try again?");
        } else {
            System.out.println(answer);
        };
    }
}
