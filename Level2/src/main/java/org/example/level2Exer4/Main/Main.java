package org.example.level2Exer4.Main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Object> stringAndIntegersList = Arrays.asList(42, "apple", "banana", 100, "kiwi", "cherry", "fig", "grape", 7);

        System.out.println("1. Alphabetically ordered by the first character");
        stringAndIntegersList.stream()

                .filter(obj -> obj instanceof String)
                .map(obj -> (String) obj )
                .sorted()
                .forEach(System.out::println);

        System.out.println("------------------");
        System.out.println("2. Strings with \"e\" go first");

        stringAndIntegersList.stream()
                .filter(obj -> obj instanceof String)
                .map(obj -> (String) obj )
                .sorted(Comparator.comparing((String s) -> !s.contains("e"))
                        .thenComparing(Comparator.naturalOrder()))
                .forEach(System.out::println);

        System.out.println("------------------");
        System.out.println("3. Swap all the \"a\" in the elements for a \"4\"");

        stringAndIntegersList.stream()
                .filter(obj -> obj instanceof String)
                .map(obj -> ((String) obj).replace("a","4"))
                .forEach(System.out::println);

        System.out.println("------------------");
        System.out.println("4. List all number elements");

        stringAndIntegersList.stream()
                .filter(obj -> obj instanceof Integer)
                .forEach(System.out::println);


    }
}
