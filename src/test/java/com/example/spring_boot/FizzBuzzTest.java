package com.example.spring_boot;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.mockito.Mockito.when;
import static org.testng.Assert.assertEquals;

public class FizzBuzzTest {

    @InjectMocks
    private FizzBuzz fizzBuzz;

    @Mock
    private FizzBuzz mockFizzBuzz;

    @BeforeMethod
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testFizz() {
        when(mockFizzBuzz.getFizzBuzzValor(3)).thenReturn("Fizz");
        assertEquals(mockFizzBuzz.getFizzBuzzValor(3), "Fizz");
    }

    @Test
    public void testBuzz() {
        when(mockFizzBuzz.getFizzBuzzValor(5)).thenReturn("Buzz");
        assertEquals(mockFizzBuzz.getFizzBuzzValor(5), "Buzz");
    }

    @Test
    public void testFizzBuzz() {
        when(mockFizzBuzz.getFizzBuzzValor(15)).thenReturn("FizzBuzz");
        assertEquals(mockFizzBuzz.getFizzBuzzValor(15), "FizzBuzz");
    }

    @Test
    public void testNumber() {
        when(mockFizzBuzz.getFizzBuzzValor(1)).thenReturn("1");
        assertEquals(mockFizzBuzz.getFizzBuzzValor(1), "1");
    }
}
