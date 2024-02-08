package org.example;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestClass {
    @Test
    public void whenEmptyString_thenAccept() {
        Palindrome palindromeTester = new Palindrome();
        assertTrue(palindromeTester.isPalindrome(""));
    }
}
