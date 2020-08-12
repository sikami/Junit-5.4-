package com.junittest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilitiesTest {

    private Utilities utilities;

    @BeforeEach
    public void setup() {
        utilities = new Utilities();
    }

    @Test
    void everyNthChar() {
        char[] input = {'h', 'e', 'l', 'l', 'o'};
        char[] result = {'e', 'l'};
        assertArrayEquals(result, utilities.everyNthChar(input, 2));
        char[] output = utilities.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'}, 8);
        assertArrayEquals(output, utilities.everyNthChar(input, 8));
    }

    @Test
    void removePairs() {
        String expected = "ABCDEF";
        String test = "AABCDDEFF";
        assertEquals(expected, utilities.removePairs(test));
        assertEquals("ABCABDEF", utilities.removePairs("ABCCABDEEF"));
        assertNull(utilities.removePairs(null));
        assertEquals("A", utilities.removePairs("A"));
        assertEquals("", utilities.removePairs(""));

    }

    @Test
    void converter() {
        assertEquals(300, utilities.converter(10,5));
        Assertions.assertThrows(ArithmeticException.class, () -> {
            assertEquals(300, utilities.converter(10,0));
        });
    }

    @Test
    void nullIfOddLength() {
        //pass a string with even length
        String nonNull = utilities.nullIfOddLength("123456");
        assertNotNull(nonNull);

        //pass a string with odd length
        String nulls = utilities.nullIfOddLength("1");
        assertNull(nulls);
    }
}