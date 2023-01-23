package org.example;

public class StringReversing {
    public static String stringReverse1(String s1) {
        String reversedString ="";
        for (int i = s1.length() - 1; i >=0; i--) {
            reversedString += s1.charAt(i);
        }
        return reversedString;
    }

    public static void main(String[] args) {
        String stringToRevers = "I'm going to go to school today morning.";
        System.out.println(stringReverse1(stringToRevers));
    }
}
