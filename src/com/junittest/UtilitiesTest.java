package com.junittest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilitiesTest {

    @Test
    void charArrays() {
        fail("About to be implemented");
    }

    @Test
    void removePairs() {
        Utilities utilities = new Utilities();
        String expected = "ABCDEF";
        String test = "AABCDDEFF";
        assertEquals(expected, utilities.removePairs(test));
        assertEquals("ABCABDEF", utilities.removePairs("ABCCABDEEF"));

    }

    @Test
    void converter() {
        Utilities utilities = new Utilities();
        assertEquals(-1, utilities.converter(6,0));
    }

    @Test
    void nullIfOddLength() {
        fail("About to be implemented");
    }
}