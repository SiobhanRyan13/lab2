package edu.canisius.cyb.cyb600.lab2;

public class Task2 {
    public String method1(String input) {
        if (input == null)
            return "";
        StringBuilder reversed = new StringBuilder(input);
        reversed.reverse();
        return reversed.toString().toUpperCase();
    }

    public String method2(String input) {
        if (input == "")
            return "";

        char firstChar = input.charAt(0);
        int length = input.length();

        StringBuilder result = new StringBuilder(length + 1);
        for (int i = 0; i < length + 1; i++) {
            result.append(firstChar);
        }

        if (length > 1) {
            result.append(input.substring(1));
        }

        return result.toString();
    }

    public String method3(String input) {
        if (input == null)
            return "";
        String[] words = input.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);
            if (i != 0)
                reversedSentence.append(" ");
        }
        return reversedSentence.toString();
    }
}
