package org.internship;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FizzBuzzTest {

    @Test
    void shouldThrowExceptionWhenArgumentIsNotString() {
        assertThrows(ClassCastException.class, () -> FizzBuzz.fizzBuzz(5));
        assertThrows(ClassCastException.class, () -> FizzBuzz.fizzBuzz(5.0));
        assertThrows(ClassCastException.class, () -> FizzBuzz.fizzBuzz(List.class));
        assertDoesNotThrow(() -> FizzBuzz.fizzBuzz("5"));
    }

    @Test
    void shouldReturnFizz() {
        final String result = FizzBuzz.fizzBuzz("3");
        final String result1 = FizzBuzz.fizzBuzz("6");
        final String result2 = FizzBuzz.fizzBuzz("9");

        assertEquals("Fizz", result);
        assertEquals("Fizz", result1);
        assertEquals("Fizz", result2);
    }

    @Test
    void shouldReturnBuzz() {
        final String result = FizzBuzz.fizzBuzz("5");
        final String result1 = FizzBuzz.fizzBuzz("10");
        final String result2 = FizzBuzz.fizzBuzz("20");

        assertEquals("Buzz", result);
        assertEquals("Buzz", result1);
        assertEquals("Buzz", result2);
    }

    @Test
    void shouldReturnFizzBuzz() {
        final String result = FizzBuzz.fizzBuzz("15");
        final String result1 = FizzBuzz.fizzBuzz("30");
        final String result2 = FizzBuzz.fizzBuzz("45");

        assertEquals("FizzBuzz", result);
        assertEquals("FizzBuzz", result1);
        assertEquals("FizzBuzz", result2);
    }

}