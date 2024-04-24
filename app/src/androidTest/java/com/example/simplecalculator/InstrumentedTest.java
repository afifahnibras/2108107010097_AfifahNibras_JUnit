package com.example.simplecalculator;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;
import com.example.simplecalculator.Calculator;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

import android.content.Context;

@RunWith(AndroidJUnit4.class)
public class InstrumentedTest {

    @Test
    public void testAddition() {
        // Test case untuk menguji fungsi penambahan dalam kelas Calculator.
        // Memanggil metode add(3, 5) dari kelas Calculator dan membandingkan hasilnya dengan 8.
        int result = Calculator.add(3, 5);
        assertEquals(8, result);
    }

    @Test
    public void testDivision() {
        // Test case untuk menguji fungsi pembagian dalam kelas Calculator.
        // Memanggil metode divide(10, 2) dari kelas Calculator dan membandingkan hasilnya dengan 5.0.
        // Jarak toleransi (delta) diberikan sebagai parameter ketiga dalam assertEquals untuk menangani ketidakpastian numerik.
        double result = Calculator.divide(10, 2);
        assertEquals(5.0, result, 0.0001);
    }
}

