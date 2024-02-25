package org.example;

import java.util.regex.Pattern;

public class UrlValidator {
    private static final String URL_REGEX = "^(https?://)?([\\w.-]+)\\.([a-zA-Z]{2,})(/[\\w.-]*)*/?$";

    public static boolean validateURL(String url) {
        return Pattern.matches(URL_REGEX, url);
    }

}
