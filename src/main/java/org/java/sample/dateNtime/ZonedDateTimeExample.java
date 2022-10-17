package org.java.sample.dateNtime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author rajeshp
 * @Date 10/17/22
 */
public class ZonedDateTimeExample {
    public static void main(String[] args) {
        // get current date-time, with system default time zone
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm:ss");
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("---Default Time Zone---");
        System.out.println(dtf.format(now));
        System.out.println(now.getOffset());

        // get current date-time, with a specified time zone
        ZonedDateTime indiaDateTime = now.withZoneSameInstant(ZoneId.of("Asia/Kolkata"));
        System.out.println("---Asia Kolkata Time Zone---");
        System.out.println(dtf.format(indiaDateTime));
        System.out.println(indiaDateTime.getOffset());

        // get current date-time, with a specified time zone
        ZonedDateTime usCST = now.withZoneSameInstant(ZoneId.of("America/Chicago"));
        System.out.println("---US Central Time Zone---");
        System.out.println(dtf.format(usCST));
        System.out.println(usCST.getOffset());

        // get current date-time, with a specified time zone
        ZonedDateTime euParisDateTime = now.withZoneSameInstant(ZoneId.of("Europe/Paris"));
        System.out.println("---Europe Paris Time Zone---");
        System.out.println(dtf.format(euParisDateTime));
        System.out.println(euParisDateTime.getOffset());        
    }
}
