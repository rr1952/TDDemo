package com.gc.demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class BrokenClassTest {
    BrokenClass bc = new BrokenClass();

    @Test
    public void isCardAMatchTrue() throws Exception {
        boolean truth = bc.isCardAMatch("Billy", "billy");
        assertTrue("Supposed to match properly!", truth);
    }

    @Test
    public void baseEncodeFileName() throws Exception {
        String expected = "c2VjcmV0";
        assertEquals("Your encoder isn't right.", expected, bc.baseEncodeFileName("secret"));
    }

    @Test
    public void roundUp() throws Exception {
        float i = 2.3f;
        int expected = 3;
        assertEquals("Rounding isn't working as intended.", expected, bc.roundUp(i));
    }

    @Test
    public void sum() throws Exception {
        int a = 2147483647;
        int b = 1;
        long expected = 2147483648l;
        assertEquals("No protection from integer overflow.", expected, (long) bc.sum(a,b));

    }

}