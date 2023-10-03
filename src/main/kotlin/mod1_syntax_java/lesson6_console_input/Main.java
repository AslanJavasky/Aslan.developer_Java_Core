package mod1_syntax_java.lesson6_console_input;

import java.util.Scanner;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-09-03
 */
public class Main {
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);

//        System.out.println("What did Severus Snape say?");
//        String answer= inputScanner.nextLine();

        System.out.println("What faculty is Harry Potter in?");
        String house = inputScanner.next();
        System.out.println("Harry Potter's Hogwarts house is " + house);

        System.out.println("How old is he?");
        int age = inputScanner.nextInt();
        System.out.println("Harry Potter's age is " + age);

    }
}
