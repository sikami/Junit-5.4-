package com.junittest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilitiesTest {

    @Test
    void everyNthChar() {
        char[] input = {'h', 'e', 'l', 'l', 'o'};
        char[] result = {'e', 'l'};
        Utilities utilities = new Utilities();
        assertArrayEquals(result, utilities.everyNthChar(input, 2));
        char[] output = utilities.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'}, 8);
        assertArrayEquals(output, utilities.everyNthChar(input, 8));
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
        assertEquals(300, utilities.converter(10,5));
        Assertions.assertThrows(ArithmeticException.class, () -> {
            assertEquals(300, utilities.converter(10,0));
        });
    }

    @Test
    void nullIfOddLength() {
        //pass a string with even length
        Utilities utilities = new Utilities();
        String nonNull = utilities.nullIfOddLength("123456");
        assertNotNull(nonNull);
        String nulls = utilities.nullIfOddLength("1");
        assertNull(nulls);

        //pass a string with odd length
    }
}