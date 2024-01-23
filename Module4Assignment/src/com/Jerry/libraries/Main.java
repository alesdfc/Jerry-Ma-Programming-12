package com.Jerry.libraries;
import java.io.IOException;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<List<String>> info = List.of(
                List.of("Name", "Occupation", "Age"),
                List.of("Zaremba", "Teacher", "39"),
                List.of("John", "Teacher", "30"),
                List.of("Jerry", "Student", "99")
        );
        try {
            library.createCSVFile("testing.csv", info);
            System.out.println(library.getRow("testing.csv", 0));
            System.out.println(library.getRow("testing.csv", 1));
            System.out.println(library.getRow("testing.csv", 2));
            System.out.println(library.getCSVContent("testing.csv"));

        } catch (IOException temp) {
            System.out.println("shouldn't be seeing this print");
        }
    }
}
