package com.gc.demo;

public class BoomFizz {
    /* Accepts an integer amd returns "Boom" if the input is divisible by or contains the digit 7.
     * Else it returns the inputted integer as a String.
     */
    public String boom(int x) {
        if (x != 0 && x % 7 == 0 || String.valueOf(x).contains("7") )
            return "Boom";
        else
            return String.valueOf(x);
    }

}
