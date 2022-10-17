package org.java.sample.system;

/**
 * @author rajeshp
 * @Date 10/17/22
 */
public class NoOfProcessors {

    /**
     * This method uses the Runtime class to get the number of available processors
     * @param args
     */
    public static void main(String[] args) {
        int processors = Runtime.getRuntime().availableProcessors();
        System.out.println(processors);
    }

}
