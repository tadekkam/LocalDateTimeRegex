package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PeselValidatorTest {

    @Test
    public void testValidPesel() {
        assertTrue(PeselValidator.validatePesel("12345678901"));
    }

    @Test
    public void testInvalidPeselFalse() {
        assertFalse(PeselValidator.validatePesel("1234567890"));
        assertFalse(PeselValidator.validatePesel("123456789012"));
        assertFalse(PeselValidator.validatePesel("a1234567890"));
        assertFalse(PeselValidator.validatePesel("abcd"));
    }

}