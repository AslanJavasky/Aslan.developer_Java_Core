package mod1_syntax_java.lesson16_regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-09-03
 */
public class Main{
    public static void main(String[] args) {

//        String phone="+90  (312) 111-22-33.";
//        System.out.println(phone.replaceAll("[^0-9\\.]",""));


        String someEmail="aslan34534534@gmail.com";



        System.out.println(isValidEmail(someEmail));


    }

    private static boolean isValidEmail(String email) {

//        Pattern pattern=Pattern.compile("[a-zA-Z0-9]+@gmail.com");
        Pattern pattern=Pattern.compile("[\\w]+@gmail.com");

        Matcher matcher=pattern.matcher(email);

        return matcher.matches();


    }
}
