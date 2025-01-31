package org.example.level1Exer8.Main;

import org.example.level1Exer8.Model.ReverseFI;

public class Main {
    public static void main(String[] args) {

        ReverseFI reverser = string -> new StringBuilder(string).reverse().toString();

        String forwardString = "I love Barcelona";
        String reversedString = reverser.reverse(forwardString);

        System.out.println(forwardString);
        System.out.println(reversedString);

    }
}
