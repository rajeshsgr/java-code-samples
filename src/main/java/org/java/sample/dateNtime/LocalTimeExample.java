package org.java.sample.dateNtime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author rajeshp
 * @Date 10/17/22
 */
public class LocalTimeExample {
    /**
     * Method to get the current local time
     * @param args
     */
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime localTime = LocalTime.now();
        System.out.println(dtf.format(localTime));
    }
}
