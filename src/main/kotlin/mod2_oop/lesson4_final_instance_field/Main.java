package mod2_oop.lesson4_final_instance_field;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-09-03
 */
public class Main {
    public static void main(String[] args) {

        Character harry = new Character("Harry Potter", 11);

        System.out.println("The character's name is " + harry.getName());

//        harry.age=11;

        harry.introduceYourself();

    }
}