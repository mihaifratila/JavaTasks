package org.example;

public class StringReversing {
    public static String stringReverse1(String s) {
        String reversedString ="";
        for (int i = s.length() - 1; i >=0; i--) {
            reversedString += s.charAt(i);
        }
        return reversedString;
    }

    public static String stringReverse2(String s) {
        char temp =' ';
        char[] stringToCharArray = s.toCharArray();
        for (int i = 0, j = stringToCharArray.length - 1; i < j; i++, j--) {
            temp = stringToCharArray[j];
            stringToCharArray[j] = stringToCharArray[i];
            stringToCharArray[i] = temp;
        }
        return new String(stringToCharArray);
    }

    public static void main(String[] args) {
        String stringToRevers = "I'm going to go to school today morning.";
        System.out.println(stringReverse2(stringToRevers));
    }
}
