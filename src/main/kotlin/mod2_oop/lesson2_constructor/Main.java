package mod2_oop.lesson2_constructor;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-09-03
 */
public class Main {
    public static void main(String[] args) {

        Character harry=new Character(11);
        harry.name="Harry Potter";
        harry.age=11;

        harry.introduceYourself();

    }
}
