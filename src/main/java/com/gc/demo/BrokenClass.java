package com.gc.demo;

import java.util.Base64;
import java.util.Base64.Encoder;

/**
 *
 */

/**
 * @author Maurice Tedder
 * Sample Class for JUnit Testing
 */
public class BrokenClass {

    /*
     * Return true if String parameter 1 is equal to parameter 2. Ignoring case.
     */
    public boolean isCardAMatch(String card1, String card2) {
        return card1.equalsIgnoreCase(card2);
    }

    /*
     * Encodes string input parameter to Base64 encoding and
     * returns value as a string.
     * Input of "secret" should return c2VjcmV0.
     */
    public String baseEncodeFileName(String fileName) {
        Encoder encoder = Base64.getEncoder();
        String encodedBytes = encoder.encodeToString(fileName.getBytes());
        return String.valueOf(encodedBytes+"s");
    }

    /*
     * Return the int portion of a float input parameter
     * that has been rounded up.
     */
    public int roundUp(float input) {
        return Math.round(input);
    }

    /*
     * Sum two ints. There is a hidden bug here. What is it?
     * Hint: https://en.wikipedia.org/wiki/Cluster_(spacecraft)
     */
    public int sum(int a, int b){
        return a + b;
    }
}