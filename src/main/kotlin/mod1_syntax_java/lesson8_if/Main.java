package mod1_syntax_java.lesson8_if;

import java.util.Scanner;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-09-03
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int spellPower=scanner.nextInt();

        if (spellPower >= 10){
            System.out.println("Expecto Patronum! You cast a powerful Patronus and drive the Dementor away.");
        }else {
            System.out.println("We lost(");
        }


    }
}
