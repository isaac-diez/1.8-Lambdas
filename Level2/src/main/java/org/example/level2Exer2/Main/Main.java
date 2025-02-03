package org.example.level2Exer2.Main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(3, 55, 44);

        String output = integerList.stream()
                .map(integer -> (integer % 2 == 0 ? "e" : "o") + integer)
                .collect(Collectors.joining(","));

        System.out.println(output);

    }
}
