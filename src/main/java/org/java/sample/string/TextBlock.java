package org.java.sample.string;

/**
 * textblock feature introduced with Java 13 now allows to store HTML, XML, SQL or JSON
 * without the use of \n literal
 * Example code to demonstrate this feature
 * @author rajeshp
 * @Date 10/18/22
 */
public class TextBlock {

    /**
     * demonstartes a variable in which JSON can be stored without using \n literal
     * Note the content has to start in next line after """
     * @return JSON Body
     */
    static String  getJSON(){

        String jsonBody="""
                {
                "name" : "Rajesh",
                "city" : "New Orleans",
                "company" : "belowthemalt.com"
                }""";

        return jsonBody;

    }

    public static void main(String[] args) {

        System.out.println(TextBlock.getJSON());

    }


}

