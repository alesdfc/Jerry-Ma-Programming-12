package Module4;
import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
public class Main {
    // Reads lines from document and adds it into an ArrayList. Then asks
    // user for input and calls for searchWord method
    public static void main(String[] args) throws Exception{
        // Read lines from text file
        HashSet<String> text = new HashSet<>();
        Scanner input=new Scanner(new File("illiad.txt"));
        input.useDelimiter(" +"); //delimitor is one or more spaces

        while(input.hasNext()){
            text.add(input.next());
        }
        System.out.println("There are " + text.size() + " unique words in this this text file");
    }
}