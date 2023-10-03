package mod2_oop.lesson23_method_reference;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-September
 */
public class Main {
    public static void main(String[] args) {

        String[] characters = {"Harry Potter", "Hermione Granger", "Ron Weasley", "Dumbledore", "Voldemort"};

        Predicate<String> hasLetterE = name -> name.contains("H");
        for (String character : characters) {
            if (hasLetterE.test(character)) {
                System.out.println("Character with 'e' in their name: " + character);
            }
        }

        Consumer<String> printCharacterName = name -> System.out.println("Character: " + name);
        for (String character : characters) {
            printCharacterName.accept(character);
        }

//        Arrays.sort(characters, (ch1,ch2) -> ch1.compareTo(ch2) );
        Arrays.sort(characters, String::compareTo);
        System.out.println("Sorted array: " + Arrays.toString(characters));

        Runnable print = System.out::println;
        print.run();

    }
}