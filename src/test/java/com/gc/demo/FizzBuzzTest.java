package com.gc.demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {
    FizzBuzz fb = new FizzBuzz();

    @Test
    public void fizzBuzzThree() throws Exception {
        String exp = "Fizz";
        assertEquals("Number divisible by 3 not returning 'Fizz", exp, fb.fizzBuzz(9));
    }

    @Test
    public void fizzBuzzFive() throws Exception {
        String exp = "Buzz";
        assertEquals("Number divisible by 5 not returning 'Buzz'", exp, fb.fizzBuzz(10));
    }

    @Test
    public void fizzBuzzFifteen() throws Exception {
        String exp = "Fizz Buzz";
        assertEquals("Number divisible by both 3 and 5 not returning 'Fizz Buzz", exp, fb.fizzBuzz(30));
    }

    @Test
    public void fizzBuzzOther() throws Exception {
        String exp = "2";
        assertEquals("Number not divisible by 3 or 5 not returning itself.", exp, fb.fizzBuzz(2));
    }
}