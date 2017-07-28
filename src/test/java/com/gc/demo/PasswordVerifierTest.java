package com.gc.demo;

import org.junit.Test;

import static com.gc.demo.PasswordVerifier.verify;
import static org.junit.Assert.*;

public class PasswordVerifierTest {

    @Test
    //This tests a password of length < 9 char. Method Verify() should return false.
    public void test1() {
        //length of actual input = 4, less than 9
        boolean actual = verify("Fizz");
        assertFalse("Input length less than 9 should not be accepted.", actual);
    }
    @Test
    //This test confirms that Verify(NULL OBJECT) will return false, as NULL is not valid.
    public void test2() {
        boolean actual = verify(null);
        assertFalse("NULL input should not be accepted", actual);
    }

    @Test
    //This tests a password that does not have an Uppercase, but lowercase+numbers;
    public void test3() {
        boolean actual = verify("abcdefghi999");
        assertFalse("This password does not contain an uppercase and should not be accepted.", actual);
    }

    @Test
    //This tests a password that does not have a lowercase, but uppercase+numbers.
    public void test4() {
        boolean actual = verify("ABCDEFG999");
        assertFalse("This password has no lowercase, and should be rejected.", actual);
    }

    @Test
    //This tests a password that does not have any numbers, but has uppercase and lowercase.
    public void test5() {
        boolean actual = verify("AAAAAAAaaaaaa");
        assertFalse("This password has no numbers, and should be rejected.", actual);
    }

    @Test
    //This tests a valid password.
    public void test6() {
        boolean actual = verify("Grandcircus9");
        assertTrue("This password is valid. Why is it being rejected?", actual);
    }
}