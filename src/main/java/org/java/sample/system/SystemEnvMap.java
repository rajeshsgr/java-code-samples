package org.java.sample.system;

import java.util.Map;
import java.util.Properties;

/**
 * @author rajeshp
 * @Date 10/17/22
 */
public class SystemEnvMap {

    /**
     * This method prints all the environment variables
     * @param args
     */
    public static void main(String[] args) {
        Map<String, String> envMap = System.getenv();
        envMap.forEach((k, v) -> System.out.println(k + ":" + v));

    }
}
