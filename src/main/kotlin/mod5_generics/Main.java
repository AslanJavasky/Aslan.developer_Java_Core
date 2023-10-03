package mod5_generics;

import java.time.LocalDate;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-September
 */
public class Main {
    public static void main(String[] args) {

        Wizard<? super Long> harry = new Wizard<>();
        harry.setName("Harry Potter");
        harry.setHouse("Gryffindor");
        harry.setBirthday(LocalDate.of(1980, 07, 31));
        harry.setId(234242L);


    }
}
