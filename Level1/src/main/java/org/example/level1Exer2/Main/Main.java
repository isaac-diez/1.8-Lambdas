package org.example.level1Exer2.Main;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> listOfStrings = new ArrayList<>();

        listOfStrings.add("apple");
        listOfStrings.add("coconut");
        listOfStrings.add("cherry");
        listOfStrings.add("date");
        listOfStrings.add("elderberry");
        listOfStrings.add("fig");
        listOfStrings.add("grape");
        listOfStrings.add("honeydew");
        listOfStrings.add("lingonberry");
        listOfStrings.add("lemon");

        List<String> stringsWithO = listOfStrings.stream()
                .filter(string -> string.contains("o") && string.length()>5)
                .toList();

        for (String word : stringsWithO) {
            System.out.println(word);
        }
    }
}
