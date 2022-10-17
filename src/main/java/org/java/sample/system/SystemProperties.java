package org.java.sample.system;

import java.util.Properties;

/**
 * @author rajeshp
 * @Date 10/17/22
 */
public class SystemProperties {
    /**
     * This method prints all the system properties
     * @param args
     */
    public static void main(String[] args) {
        Properties properties = System.getProperties();
        properties.forEach((k, v) -> System.out.println(k + ":" + v));

    }
}
