package org.example.level2Exer3.Main;

import org.example.level2Exer3.Model.FIOperation;

public class Main {
    public static void main(String[] args) {

        FIOperation sum = ((a, b) -> (float) (a + b));
        FIOperation subtract = ((a, b) -> (float) (a - b));
        FIOperation multiply = ((a, b) -> (float) (a * b));
        FIOperation divide = ((a, b) -> (float) (a / b));

        System.out.println(sum.operation(3,6));
        System.out.println(subtract.operation(7,2));
        System.out.println(multiply.operation(5,3));
        System.out.println(divide.operation(13,7));

    }
}
