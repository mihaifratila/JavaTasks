package org.example;

public class Task2 {
    public static String stringReverse1(String s) {
        String reversedString ="";
        for (int i = s.length() - 1; i >=0; i--) {
            reversedString += s.charAt(i);
        }
        return reversedString;
    }

    public static String stringReverse2(String s) {
        char temp;
        char[] stringToCharArray = s.toCharArray();
        for (int i = 0, j = stringToCharArray.length - 1; i < j; i++, j--) {
            temp = stringToCharArray[j];
            stringToCharArray[j] = stringToCharArray[i];
            stringToCharArray[i] = temp;
        }
        return new String(stringToCharArray);
    }

    public static String stringReverse3(String s) {
        StringBuilder reverseStringBuilder = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i--) {
            reverseStringBuilder.append(s.charAt(i));
        }
        return reverseStringBuilder.toString();
    }

    public static void main(String[] args) {
        String stringToRevers = "I'm going to go to school today morning.";
        System.out.println(stringReverse3(stringToRevers));
    }
}
