package org.java.sample.dateNtime;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

/**
 * @author rajeshp
 * @Date 10/17/22
 */

public class LocalDateExample {
    /**
     * Method to get the current local date
     * @param args
     */
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/uuuu");
        LocalDate localDate = LocalDate.now();
        System.out.println(dtf.format(localDate));
    }
}
