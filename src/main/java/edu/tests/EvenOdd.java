package edu.tests;

public class EvenOdd {

    public String check(int number) {
        if (number % 2 == 0) {
            return "Even";
        }
        else if (number % 2 != 0) {
            return "Odd";
        }
        else throw new IllegalArgumentException("Not a number");
    }
}
