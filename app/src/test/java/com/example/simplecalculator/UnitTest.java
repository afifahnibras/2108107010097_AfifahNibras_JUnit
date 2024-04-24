package com.example.simplecalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class UnitTest {

    @Test
    public void addition_isCorrect() {
        // Test case untuk menguji operasi penambahan.
        // Memastikan bahwa 2 + 2 sama dengan 4.
        assertEquals(4, 2 + 2);
    }

    @Test
    public void subtraction_isCorrect() {
        // Test case untuk menguji operasi pengurangan.
        // Memastikan bahwa 4 - 2 sama dengan 2.
        assertEquals(2, 4 - 2);
    }

    @Test
    public void multiplication_isCorrect() {
        // Test case untuk menguji operasi perkalian.
        // Memastikan bahwa 4 * 2 sama dengan 8.
        assertEquals(8, 4 * 2);
    }

    @Test
    public void division_isCorrect() {
        // Test case untuk menguji operasi pembagian.
        // Memastikan bahwa 4 / 2 sama dengan 2.
        assertEquals(2, 4 / 2);
    }
}

