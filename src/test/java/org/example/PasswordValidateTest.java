package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PasswordValidateTest {

    @Test
    public void testValidPasswords() {
        assertTrue(PasswordValidator.validatePassword("Password123"));
        assertTrue(PasswordValidator.validatePassword("SecurePass9"));
        assertTrue(PasswordValidator.validatePassword("StrongPW2022"));
    }

    @Test
    public void testInvalidPasswords() {
        assertFalse(PasswordValidator.validatePassword("password"));
        assertFalse(PasswordValidator.validatePassword("PASSWORD"));
        assertFalse(PasswordValidator.validatePassword("Pass"));
        assertFalse(PasswordValidator.validatePassword("SecurePW21"));
    }
}
