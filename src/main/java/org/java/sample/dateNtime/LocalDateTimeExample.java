package org.java.sample.dateNtime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author rajeshp
 * @Date 10/17/22
 */
public class LocalDateTimeExample {
    /**
     * Method to get the current local date and time
     * @param args
     */
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/uuuu HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }
}
