package org.internship;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FizzBuzzTest {

    @Test
    void exception() {
        assertThrows(ClassCastException.class, () -> FizzBuzz.fizzBuzz(5));
    }

    @Test
    void fizzBuzz() {
        final String result = FizzBuzz.fizzBuzz("15");

        assertEquals("FizzBuzz", result);
    }

    @Test
    void Buzz() {
        final String result = FizzBuzz.fizzBuzz("5");

        assertEquals("Buzz", result);
    }

    @Test
    void Fizz() {
        final String result = FizzBuzz.fizzBuzz("3");

        assertEquals("Fizz", result);
    }

}