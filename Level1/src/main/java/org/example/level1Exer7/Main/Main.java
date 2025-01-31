package org.example.level1Exer7.Main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> stringAndIntegersList = Arrays.asList(42, "apple", "banana", 100, "kiwi", "cherry", "fig", "grape", 7);

        List<String> filteredList = stringAndIntegersList.stream()
                .filter(obj -> obj instanceof String)
                .map(obj -> (String) obj )
                .sorted(Comparator.comparingInt(String::length).reversed())
                .toList();

        filteredList.forEach(System.out::println);

    }
}
