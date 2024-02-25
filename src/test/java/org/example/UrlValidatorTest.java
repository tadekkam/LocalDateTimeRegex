package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class UrlValidatorTest {

    @Test
    public void UrlValidatorTest() {
        assertTrue(UrlValidator.validateURL("http://www.onet.pl"));
        assertTrue(UrlValidator.validateURL("https://mail.google.com"));
        assertTrue(UrlValidator.validateURL("http://wiadmosci.onet.pl"));
        assertTrue(UrlValidator.validateURL("http://onet.pl"));
    }

}