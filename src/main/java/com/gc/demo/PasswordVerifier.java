package com.gc.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordVerifier {


    public static boolean verify (String input) {
        Pattern pattern;
        Matcher matcher;
        // series of if statements to test if password meets criteria
        if (input != null) {
            //Checks length
            if (input.length() <= 8) return false;

            // This pattern should be for at least 1 uppercase.
            pattern = Pattern.compile("^(.*[A-Z]+?.*$)");
            matcher = pattern.matcher(input);
            // Checks for uppercase pattern.
            if (!matcher.matches()) return false;

            pattern = Pattern.compile("^(.*[a-z]+?.*$)");
            matcher = pattern.matcher(input);
            // Checks for lowercase pattern.
            if (!matcher.matches()) return false;

            pattern = Pattern.compile("^(.*[0-9]+?.*$)");
            matcher = pattern.matcher(input);
            // Checks for numerical pattern.
            if (!matcher.matches()) return false;

            // if it passes all the if statements, then it is valid and returns true.
            // circumvent nullpointerexception by checking if input is NOT NULL. If null, return false at the end.
            return true;
        }
        else return false;
    }
}
