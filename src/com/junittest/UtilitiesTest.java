package com.junittest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilitiesTest {

    @Test
    void charArrays() {
        char[] input = {'h', 'e', 'l', 'l', 'o'};
        char[] result = {'e', 'l'};
        Utilities utilities = new Utilities();
        assertArrayEquals(result, utilities.charArrays(input, 2));
    }

    @Test
    void removePairs() {
        Utilities utilities = new Utilities();
        String expected = "ABCDEF";
        String test = "AABCDDEFF";
        assertEquals(expected, utilities.removePairs(test));
        assertEquals("ABCABDEF", utilities.removePairs("ABCCABDEEF"));
        assertNull("did not get null argument when string is passed", utilities.removePairs(null));
        assertEquals("A", utilities.removePairs("A"));
        assertEquals("", utilities.removePairs(""));

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