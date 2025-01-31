package org.example.level1Exer1.Main;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> listOfStrings = new ArrayList<>();

        listOfStrings.add("The sky is clear and full of stars tonight.");
        listOfStrings.add("Reading helps the mind stay sharp and active.");
        listOfStrings.add("A quick brown fox jumps over the lazy dog.");
        listOfStrings.add("Learning new things keeps life interesting.");
        listOfStrings.add("She sells seashells by the seashore.");
        listOfStrings.add("Time flies when you're having fun.");
        listOfStrings.add("Every day is a new beginning.");
        listOfStrings.add("The cat sat on the mat and purred softly.");
        listOfStrings.add("Hard work always pays off in the end.");
        listOfStrings.add("Dream big and never stop believing.");

        listOfStrings.stream()
                .filter(String -> String.contains("o")||String.contains("O"))
                .forEach(System.out::println);

    }


}