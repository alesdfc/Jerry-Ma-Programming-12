package Module5;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Encrypt {
    public static String encrypt(String cool, int shift) {
        //Initialize and populate alphabet HashMap
        StringBuffer test = new StringBuffer("");
        HashMap<Integer, Character> alphabet = new HashMap<>();
        alphabet.put(0, 'a');
        alphabet.put(1, 'b');
        alphabet.put(2, 'c');
        alphabet.put(3, 'd');
        alphabet.put(4, 'e');
        alphabet.put(5, 'f');
        alphabet.put(6, 'g');
        alphabet.put(7, 'h');
        alphabet.put(8, 'i');
        alphabet.put(9, 'j');
        alphabet.put(10, 'k');
        alphabet.put(11, 'l');
        alphabet.put(12, 'm');
        alphabet.put(13, 'n');
        alphabet.put(14, 'o');
        alphabet.put(15, 'p');
        alphabet.put(16, 'q');
        alphabet.put(17, 'r');
        alphabet.put(18, 's');
        alphabet.put(19, 't');
        alphabet.put(20, 'u');
        alphabet.put(21, 'v');
        alphabet.put(22, 'w');
        alphabet.put(23, 'x');
        alphabet.put(24, 'y');
        alphabet.put(25, 'z');

        //Loop through ciphertext.txt
        for (int i  = 0; i < cool.length(); i++) {
            //If current character is a space, append space to decrypted
            if (cool.charAt(i) == ' ') {
                test.append(' ');
            } else {
                test.append(alphabet.get(((int)cool.charAt(i) - 97 + shift)%26));
                }
            }
        return test.toString();
    }
}
