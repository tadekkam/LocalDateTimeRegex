package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberValidator {
        public static void main(String[] args) {
        String text = "342\n" +
                "5.34\n" +
                "756\n" +
                "1.234e+07\n" +
                "7.234243E-02\n" +
                "6.09\n" +
                "3457\n" +
                "87\n" +
                "1.0001\n" +
                "3\n" +
                "5\n";

        Pattern integerPattern = Pattern.compile("^\\d+$", Pattern.MULTILINE);
        Pattern floatingPointPattern = Pattern.compile("\\b\\d+\\.\\d+\\b", Pattern.MULTILINE);
        Pattern scientificNotationPattern = Pattern.compile("\\b\\d+\\.\\d+e[+-]?\\d+\\b", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);

        Matcher integerMatcher = integerPattern.matcher(text);
        Matcher floatingPointMatcher = floatingPointPattern.matcher(text);
        Matcher scientificNotationMatcher = scientificNotationPattern.matcher(text);

        System.out.println("Liczby całkowite:");
        while (integerMatcher.find()) {
            System.out.println(integerMatcher.group());
        }

        System.out.println("\nLiczby zmiennoprzecinkowe:");
        while (floatingPointMatcher.find()) {
            System.out.println(floatingPointMatcher.group());
        }

        System.out.println("\nLiczby w notacji naukowej:");
        while (scientificNotationMatcher.find()) {
            System.out.println(scientificNotationMatcher.group());
        }
    }
}

