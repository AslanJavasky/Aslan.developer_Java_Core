package mod2_oop.lesson6_factory_methods;

import java.time.LocalDate;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-09-03
 */
public class Main {
    public static void main(String[] args) {

        Character harry=new Character(
                "Harry Potter",
                11,
                LocalDate.of(1980, 7,31)
        );

        Character draco=Character.getInstance(
                "Draco Malfoy",11,
                LocalDate.of(1980,6,5)
        );

        System.out.println(harry);
        System.out.println(draco);

    }
}