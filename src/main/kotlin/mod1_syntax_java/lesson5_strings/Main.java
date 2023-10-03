package mod1_syntax_java.lesson5_strings;

import java.util.Locale;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-09-03
 */
public class Main {
    public static void main(String[] args) {

        String greeting = "Hello Hogwarts";
        String schoolName = greeting.substring(6);

        System.out.println("The name of school is " + schoolName);

        System.out.println(schoolName.equals("Hogwarts"));
        System.out.println(schoolName.equalsIgnoreCase("hogwarts"));
        System.out.println(schoolName != null && !schoolName.isEmpty());
        System.out.println(schoolName.startsWith("Hog"));
        System.out.println(schoolName.endsWith("s"));
        System.out.println(schoolName.toLowerCase(Locale.ROOT));
        System.out.println(schoolName.toUpperCase(Locale.ROOT));

        StringBuilder sb=new StringBuilder();
        sb.append("The name of our favourite school is ");
        sb.append(schoolName);
        sb.append("!");
        System.out.println(sb.toString());




    }
}
