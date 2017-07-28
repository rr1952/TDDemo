package com.gc.demo;

public class FizzBuzz {

    public String fizzBuzz(int x) {
        if (x % 3 != 0 && x % 5 != 0) return String.valueOf(x);
        String ret = "";
        if (x % 3 == 0) {
           ret = ret.concat("Fizz");
        }
        if (x % 15 == 0) {
            ret = ret.concat(" ");
        }
        if (x % 5 == 0) {
            ret = ret.concat("Buzz");
        }
        return ret;
    }

}
