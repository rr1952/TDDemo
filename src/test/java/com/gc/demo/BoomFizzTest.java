package com.gc.demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class BoomFizzTest {

    @Test
    public void boomTest1() throws Exception {
         String expected = "1";
         String actual = new BoomFizz().boom(1);
         assertEquals("Your code sux!", expected, actual);
    }

    @Test
    public void boomTest7() throws Exception {
        String expect = "Boom";
        String actual = new BoomFizz().boom(7);
        assertEquals("Your code sucks!", expect, actual);
    }

}