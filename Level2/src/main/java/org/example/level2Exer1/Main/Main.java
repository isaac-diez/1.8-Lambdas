package org.example.level2Exer1.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Ana","Joan","Pere","Antoni","Ada","Isaac","Ala","Josep");

        stringList.stream()
                .filter(string -> string.startsWith("A") && string.length()==3)
                .forEach(System.out::println);

    }

}
