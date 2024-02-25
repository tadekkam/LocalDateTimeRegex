package org.example;

import java.util.regex.Pattern;

public class PasswordValidator {

    private static final int MIN_LENGTH = 7;
    public static boolean validatePassword(String password) {
        String regex = "^(?=.*[A-Z])(?=.*\\d)(?!.*(?:2021|21)).{" + MIN_LENGTH + ",}$";
        return Pattern.matches(regex, password);
    }

}
