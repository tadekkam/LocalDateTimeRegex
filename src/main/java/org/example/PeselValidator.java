package org.example;

import java.util.regex.Pattern;

public class PeselValidator {
    private static final String PESEL_REGEX = "\\d{11}";

    public static boolean validatePesel(String pesel) {
        return Pattern.matches(PESEL_REGEX, pesel);
    }

}
