package org.java.sample.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Example of simple pattern match using regex
 * \\d = only digit allow
 * {3} = length
 * {4} = length
 * @author rajeshp
 * @Date 10/19/22
 */
public class PhoneNumberRegexPattern {

    public static void main(String[] argv) {

        String phoneNumber = "504-888-9999";

        Pattern pattern = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");
        Matcher matcher = pattern.matcher(phoneNumber);

        if (matcher.matches()) {
            System.out.println("Phone Number Valid");
        }
        else
        {
            System.out.println("Phone Number must be in the form XXX-XXX-XXXX");
        }
    }

}
